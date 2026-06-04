object Bob {
    fun hey(input: String): String {
        val cleanInput = input.trim()
        return when {
            cleanInput.isBlank() -> "Fine. Be that way!"
            cleanInput.endsWith("?") && input == input.uppercase() && input.any {it.isLetter()}   -> "Calm down, I know what I'm doing!"
            cleanInput.endsWith("?") -> "Sure."
            cleanInput == input.uppercase() && input.any {it.isLetter()} -> "Whoa, chill out!"
            
            else -> "Whatever."
        }
    }
}
