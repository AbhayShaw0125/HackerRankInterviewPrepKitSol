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
     * Complete the 'twoArrays' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER k
     *  2. INTEGER_ARRAY A
     *  3. INTEGER_ARRAY B
     */

def twoArrays(k: Int, A: Array[Int], B: Array[Int]): String = {
    
   
    val sortedA = A.sorted
    
    
    val sortedB = B.sorted(Ordering[Int].reverse)
    
   
    for (i <- 0 until A.length) {
        if (sortedA(i) + sortedB(i) < k)
            return "NO"
    }
    
    "YES"
}

}

object Solution {
    def main(args: Array[String]) {
        val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

        val q = StdIn.readLine.trim.toInt

        for (qItr <- 1 to q) {
            val firstMultipleInput = StdIn.readLine.replaceAll("\\s+$", "").split(" ")

            val n = firstMultipleInput(0).toInt

            val k = firstMultipleInput(1).toInt

            val A = StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)

            val B = StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)
            val result = Result.twoArrays(k, A, B)

            printWriter.println(result)
        }

        printWriter.close()
    }
}
