
package labsheet8
import scala.io.StdIn
object q1 {
  def main(args: Array[String]): Unit = {
    print("Enter the list of integers separated by commas: ")
    val InputString = StdIn.readLine()
    val InputList = InputString.split(",").map(_.toInt).toList

    val Output = filterEvenNumbers(InputList)
    println("\n" + Output)

  }

  def filterEvenNumbers(numbers: List[Int]): List[Int] = {
    numbers.filter(num => num % 3 == 0)
  }

}
