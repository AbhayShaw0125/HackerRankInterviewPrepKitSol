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
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    def plusMinus(arr: Array[Int]) {
        var a = 0
        var b = 0
        var c = 0
        
        for (ae <- arr) {
            if (ae > 0) {
                a = a + 1
            } else if (ae < 0) {
                b = b + 1
            } else {
                c = c + 1
            }
        }
        
        println(a.toDouble / arr.length)
        println(b.toDouble / arr.length)
        println(c.toDouble / arr.length)
    }
}

object Solution {
    def main(args: Array[String]) {
        val n = StdIn.readLine.trim.toInt

        val arr = StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)

        Result.plusMinus(arr)
    }
}
