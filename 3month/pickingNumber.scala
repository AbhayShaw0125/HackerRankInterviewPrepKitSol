import java.io._
import java.math._
import java.security._
import java.text._
import java.util._
import java.util.concurrent._
import java.util.function._
import java.util.regex._
import java.util.stream._
import scala.collection.immutable._
import scala.collection.mutable._
import scala.collection.concurrent._
import scala.concurrent._
import scala.io._
import scala.math._
import scala.sys._
import scala.util.matching._
import scala.reflect._

object Result {

    /*
     * Complete the 'pickingNumbers' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    def pickingNumbers(a: Array[Int]): Int = {
        val freq = Array.fill(101)(0)

        for (x <- a) {
            freq(x) += 1
        }

        var maxNum = 0

        for (i <- 0 until 100) {
            maxNum = math.max(maxNum, freq(i) + freq(i + 1))
        }

        maxNum
    }
}

object Solution {
    def main(args: Array[String]) {
        val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

        val n = StdIn.readLine.trim.toInt

        val a = StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)

        val result = Result.pickingNumbers(a)

        printWriter.println(result)

        printWriter.close()
    }
}
