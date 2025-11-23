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
     * Complete the 'migratoryBirds' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

def migratoryBirds(arr: Array[Int]): Int = {
    val count = Array.fill(6)(0)  
    arr.foreach(id => count(id) += 1)

    var maxCount = 0
    var result = 1

    for (i <- 1 to 5) {
        if (count(i) > maxCount) {
            maxCount = count(i)
            result = i
        }
    }

    result
}
}
object Solution {
    def main(args: Array[String]) {
        val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

        val arrCount = StdIn.readLine.trim.toInt

        val arr = StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)

        val result = Result.migratoryBirds(arr)

        printWriter.println(result)

        printWriter.close()
    }
}
