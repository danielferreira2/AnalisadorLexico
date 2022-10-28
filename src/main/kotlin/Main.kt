import java.io.File

fun main() {

  val file = File("src/main/resources/test.txt")
  val input = file.readText()

  val lexScanner = LexScanner(input)
  println(lexScanner.tokenTable)

  val outFile = File("src/main/resources/output.txt")
  outFile.writeText(lexScanner.tokenTable.toString())

}



