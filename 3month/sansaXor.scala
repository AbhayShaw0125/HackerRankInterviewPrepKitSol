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
     * Complete the 'sansaXor' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    def sansaXor(arr: Array[Int]): Int = {
    // Write your code here
    if (arr.length % 2 ==0){
        return 0
    }
    var result =0
    for(i <- 0 until arr.length by 2){
        result^=arr(i)
    }
    result

    }

}

object Solution {
    def main(args: Array[String]) {
        val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

        val t = StdIn.readLine.trim.toInt

        for (tItr <- 1 to t) {
            val n = StdIn.readLine.trim.toInt

            val arr = StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)
            val result = Result.sansaXor(arr)

            printWriter.println(result)
        }

        printWriter.close()
    }
}
