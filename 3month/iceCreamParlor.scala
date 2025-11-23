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
     * Complete the 'icecreamParlor' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER m
     *  2. INTEGER_ARRAY arr
     */

    def icecreamParlor(m: Int, arr: Array[Int]): Array[Int] = {
    // Write your code here
     for (i<-0 until arr.length){
        for (j <-i+1 until arr.length){
            if(arr(i)+arr(j)==m)
                reaturn Array(i + 1, j + 1) 
        }
     }
    Array(-1, -1) 

    }

}

object Solution {
    def main(args: Array[String]) {
        val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

        val t = StdIn.readLine.trim.toInt

        for (tItr <- 1 to t) {
            val m = StdIn.readLine.trim.toInt

            val n = StdIn.readLine.trim.toInt

            val arr = StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)
            val result = Result.icecreamParlor(m, arr)

            printWriter.println(result.mkString(" "))
        }

        printWriter.close()
    }
}
