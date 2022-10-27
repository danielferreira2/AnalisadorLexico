import java.io.File

fun main() {

  val file = File("src/main/resources/test.txt")
  val input = file.readText()
  val lexScanner = LexScanner(input)
  println(lexScanner.tokenTable)
  

}



