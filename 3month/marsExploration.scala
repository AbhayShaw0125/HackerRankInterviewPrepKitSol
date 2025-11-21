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
     * Complete the 'marsExploration' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    def marsExploration(s: String): Int = {
    // Write your code here
    var r =s.length/3
    val target="SOS"*r
    var count=0
    for(i<- 0 until s.length){
        if(s(i)!=target(i)){
            count+=1
        }
    }
     count
    }

}

object Solution {
    def main(args: Array[String]) {
        val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

        val s = StdIn.readLine

        val result = Result.marsExploration(s)

        printWriter.println(result)

        printWriter.close()
    }
}
