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
     * Complete the 'minimumNumber' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. STRING password
     */

 def minimumNumber(n: Int, password: String): Int = {
    val spl = "!@#$%^&*()-+"
    val arr = Array.fill(4)(0)

    for (ch <- password) {
        if (ch.isLower) {
            arr(0) = 1
        } else if (ch.isUpper) {
            arr(1) = 1
        } else if (ch.isDigit) {
            arr(2) = 1
        } else if (spl.contains(ch)) {
            arr(3) = 1
        }
    }

    val missingTypes = 4 - arr.sum
    val missingLength = math.max(0, 6 - password.length)

    math.max(missingTypes, missingLength)
}
}


object Solution {
    def main(args: Array[String]) {
        val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

        val n = StdIn.readLine.trim.toInt

        val password = StdIn.readLine

        val answer = Result.minimumNumber(n, password)

        printWriter.println(answer)

        printWriter.close()
    }
}
