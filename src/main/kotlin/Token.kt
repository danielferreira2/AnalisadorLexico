class Token(value: String, classification: String) {

   private val value: String
   private val classification: String

    init{
        this.value = value
        this.classification = classification
    }

    override fun toString(): String {
        return "[ value ='$value', classification = '$classification' ]\n"
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