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
     * Complete the 'pageCount' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER p
     */
def pageCount(n: Int, p: Int): Int = {
    val front = p / 2
    val back =
        if (n % 2 == 0)
            (n - p + 1) / 2   
        else
            (n - p) / 2     

    scala.math.min(front, back)
}
}


object Solution {
    def main(args: Array[String]) {
        val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

        val n = StdIn.readLine.trim.toInt

        val p = StdIn.readLine.trim.toInt

        val result = Result.pageCount(n, p)

        printWriter.println(result)

        printWriter.close()
    }
}
