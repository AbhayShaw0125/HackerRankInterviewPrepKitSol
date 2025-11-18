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
     * Complete the 'matchingStrings' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. STRING_ARRAY strings
     *  2. STRING_ARRAY queries
     */

    def matchingStrings(strings: Array[String], queries: Array[String]): Array[Int] = {
    // Write your code here
    val freq = strings.groupBy(identity).mapValues(_.length).toMap
    queries.map(q=>freq.getOrElse(q,0))

    }

}

object Solution {
    def main(args: Array[String]) {
        val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

        val stringsCount = StdIn.readLine.trim.toInt

        val strings = Array.ofDim[String](stringsCount)

        for (i <- 0 until stringsCount) {
            val stringsItem = StdIn.readLine
            strings(i) = stringsItem
        }

        val queriesCount = StdIn.readLine.trim.toInt

        val queries = Array.ofDim[String](queriesCount)

        for (i <- 0 until queriesCount) {
            val queriesItem = StdIn.readLine
            queries(i) = queriesItem
        }

        val res = Result.matchingStrings(strings, queries)

        printWriter.println(res.mkString("\n"))

        printWriter.close()
    }
}
