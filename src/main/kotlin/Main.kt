import java.io.File

fun main(args: Array<String>) {

  var file = File("C:\\Users\\danie\\OneDrive\\Documentos\\GitHub\\AnalisadorLexico\\src\\main\\resources\\test.txt")
  var input = file.readText()
  var lexScanner = LexScanner(input)
  println(lexScanner.tokens)
  

  
}



