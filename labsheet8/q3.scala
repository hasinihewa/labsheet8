package labsheet8

object q3 {
  def toUpper(str: String): String = {
    str.toUpperCase
  }
  def toLower(str: String): String = {
    str.toLowerCase
  }

  def formatNames(name: String)(formatFunc: String => String): String = formatFunc(name)

    def main(args: Array[String]): Unit = {
      var name = "Benny"
      println(formatNames(name) { str => toUpper(str) })

      name = "Niroshan"
      println(formatNames(name) {
        str =>
          val firsthalf = str.substring(0, 2)
          val sechalf = str.substring(2)
          toUpper(firsthalf) + toLower(sechalf)
      })

      name = "Saman"
      println(formatNames(name) { str => toLower(str) })

      name = "Kumara"
      println(formatNames(name) {
        str =>
          val firsthalf = str.substring(0, 1)
          val sechalf = str.substring(1, 5)
          val thirdhalf = str.substring(5)
          toUpper(firsthalf) + toLower(sechalf) + toUpper(thirdhalf)
      })
    }
  }



