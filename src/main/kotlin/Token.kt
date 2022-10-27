class Token(value: String,index: Int, type: String) {

   private val value: String
   private val type: String
   private val index: Int

    init{
        this.value = value
        this.type = type
        this.index = index
    }

    override fun toString(): String {
        return "[ value: '$value', index: $index, type: '$type' ]\n"
    }

    companion object{
        const val IDENTIFIER = "IDENTIFIER"
        const val NUMBER = "NUMBER"
        const val KEYWORD = "KEYWORD"
        const val ARITHMETIC_OPERATOR = "ARITHMETIC_OPERATOR"
        const val RELATIONAL_OPERATOR = "RELATIONAL_OPERATOR"
        const val ASSIGNMENT_OPERATOR = "ASSIGNMENT_OPERATOR"
        const val INVALID_TOKEN = "INVALID_TOKEN"
    }
}