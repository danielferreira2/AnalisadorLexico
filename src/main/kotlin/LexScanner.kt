

class LexScanner(input:String) {
  private val input: String
  var tokens: List<String>

 
  
  init {
    this.input = input
    tokens = parser(input)
  
    
  }
  
  
  private fun parser(str: String) : List<String> {
    var left = 0
    var right = 0
    var token: String
    val tokenList = mutableListOf<String>()
     
    while(left <= right && right < str.length) {
      if(!isPunctuator(str[right])){
        right++
      }
      if(isPunctuator(str[right]) && left == right){
        if(isOperator(str[right])){
          tokenList.add(str[right].toString())
        }
        
        right++
        left = right
        
      }else if(isPunctuator(str[right]) && left != right||
              (right == str.length-1 && left != right)){
        token = str.substring(left, right)
        tokenList.add(token)
        left = right
      }
    }
    
    return tokenList
  }
  
      
    
  
  
  private fun isArithmetics(c: Char): Boolean {
    return when (c) {
      '+' -> true
      '-' -> true
      '*' -> true
      '/' -> true
      else -> false
    }
  }
  
  private fun isRelational(c: Char): Boolean {
    return when (c) {
      '>' -> true
      '<' -> true
      '=' -> true
      else -> false
    }
  }
  private fun isAssignment(c: Char): Boolean {
    return when (c) {
      '=' -> true
      else -> false
    }
  }
  
  private fun isPunctuator(c: Char): Boolean {
    if (c.isWhitespace() || isArithmetics(c) || isRelational(c)) {
      return true
    }
    return false
  }
  
  private fun isOperator(c: Char): Boolean {
    if (isPunctuator(c) && !c.isWhitespace()) {
      return true
    }
    return false
  }
  
  private fun isKeyword(str: String): Boolean {
    return when (str) {
      "var" -> true
      "if" -> true
      "else" -> true
      "while" -> true
      "for" -> true
      "fun" -> true
      "class" -> true
      "import" -> true
      "return" -> true
      else -> false
    }
  }
  
  
  private fun isNumber(str: String):Boolean{
    val len = str.length
    if(len == 0) return false
    for (i in 0 until len) {
      if (!str[i].isDigit()) {
        return false
      }
    }
    return true
  }
  
  private fun validIdentifier(str: String): Boolean {
    if(isNumber(str) || isPunctuator(str[0])){
      return false
    }
    

    val len = str.length
    if (len == 1) {
      return true
    }else for(i in 1 until len){
      if(isPunctuator(str[i])){
        return false
      }
    }
    
    return true
  }
  
  
}



