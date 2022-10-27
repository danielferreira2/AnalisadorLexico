

class LexScanner(input:String) {
    private val input: String
    var tokens: List<String>
    var tokenTable: List<Token>


    init {
        this.input = input
        tokens = getTokensList(input)
        tokenTable = getTokenTable(tokens)
    }


    private fun getTokensList(str: String): List<String> {

        var left = 0
        var right = 0
        var token: String
        val tokenList = mutableListOf<String>()

        while (left <= right && right < str.length) {

            if(!isSeparator(str[right])) right++

            if(isSeparator( str[right]) && left == right ){

                if(isOperator(str[right])){
                    tokenList.add(str[right].toString())
                }

                right++
                left = right

            }else if(isSeparator(str[right]) && left != right
                || right == str.length-1 && left != right){
                token = str.substring(left, right)
                tokenList.add(token)
                left = right
            }
        }
        return tokenList
    }


    private fun getTokenTable(tokenList:List<String>):List<Token>{
        val tokenTable = mutableListOf<Token>()
        for((index, token) in tokenList.withIndex()){
           when{
               isNumber(token) -> tokenTable.add(Token(token,index, Token.NUMBER))
               isKeyword(token) -> tokenTable.add(Token(token,index, Token.KEYWORD))
               isIdentifier(token) -> tokenTable.add(Token(token,index, Token.IDENTIFIER))
               isArithmetics(token[0]) -> tokenTable.add(Token(token,index, Token.ARITHMETIC_OPERATOR))
               isRelational(token[0]) -> tokenTable.add(Token(token,index, Token.RELATIONAL_OPERATOR))
               isAssignment(token[0]) -> tokenTable.add(Token(token,index, Token.ASSIGNMENT_OPERATOR))
               else -> tokenTable.add(Token(token,index, Token.INVALID_TOKEN))
           }
        }
        return tokenTable
    }


    private  fun isSpace(c: Char):Boolean{
        return c.isWhitespace()
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
            else -> false
        }
    }
    private fun isAssignment(c: Char): Boolean {
        return  c == '='
    }
    private fun isSeparator(c: Char):Boolean{
        return isSpace(c) || isArithmetics(c) || isRelational(c) || isAssignment(c)
    }
    private fun isOperator(c: Char): Boolean{
        return (isSeparator(c) && !isSpace(c))
    }

    private fun isKeyword(str: String): Boolean {
        return when (str) {
            "equals"-> true
            "var" -> true
            "if" -> true
            "else" -> true
            "while" -> true
            "fun" -> true
            "return" -> true
            else -> false
        }
    }
    private fun isLetter(c: Char): Boolean {
        return c.isLetter()
    }
    private fun isNumber(str: String): Boolean{
        val len = str.length
        if (str.isEmpty()) return false

        for(index in 0 until len){
            if(!str[index].isDigit()) return false
        }

        return true
    }

    private fun isIdentifier(str: String): Boolean{

        if(isNumber(str) || isSeparator(str[0])){
            return false
        }

        val len = str.length

        if(len == 1){
            return true
        }else for(index in 1 until len){
            if(isSeparator(str[index])){
                return false
            }else if(!isLetter(str[index])&&!isNumber(str[index].toString())){
                return false
            }
        }

        return true
    }



}




