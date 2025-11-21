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
     * Complete the 'pangrams' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    def pangrams(s: String): String = {
      val lower = s.toLowerCase

    for (c <- 'a' to 'z') {
        if (!lower.contains(c)) return "not pangram"
    }

    "pangram"

    }

}

object Solution {
    def main(args: Array[String]) {
        val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

        val s = StdIn.readLine

        val result = Result.pangrams(s)

        printWriter.println(result)

        printWriter.close()
    }
}
