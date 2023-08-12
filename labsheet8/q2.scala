object q2{
  def processInput(input: Int): Unit = {
    input match {
      case n if n <= 0 => println("Negative/Zero input")
      case n if n % 2 == 0 => println("Even number is given")
      case n => println("Odd number is given")
    }
  }
  def main(arry: Array[String]): Unit = {
    if (arry.length > 0) {
      try {
        val inputNumber = arry(0).toInt
        processInput(inputNumber)
      } catch {
        case _: NumberFormatException =>
          println("Invalid input. Please enter a valid integer.")
      }
    } else {
      println("Please provide an integer as a command line argument.")
    }
  }}



