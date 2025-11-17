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
     * Complete the 'caesarCipher' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. INTEGER k
     */

    def caesarCipher(s: String, k: Int): String = {
        var s1: String = ""

        for (ch <- s) {
            if (ch.isLetter) {
                val base = if (ch.isLower) 'a' else 'A'
                val newChar = ((ch - base + k) % 26 + base).toChar
                s1 += newChar
            } else {
                s1 += ch
            }
        }

        s1
    }

}

object Solution {
    def main(args: Array[String]) {
        val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

        val n = StdIn.readLine.trim.toInt

        val s = StdIn.readLine

        val k = StdIn.readLine.trim.toInt

        val result = Result.caesarCipher(s, k)

        printWriter.println(result)

        printWriter.close()
    }
}
