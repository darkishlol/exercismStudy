object CollatzCalculator {
    fun computeStepCount(start: Int): Int {
        if (start <= 0) {
            throw IllegalArgumentException("Error: the number must be higher than 0")
        }
        var number = start
        var steps = 0
    
        while(number > 1) {
            if (number % 2 == 0) {
                number = number / 2
            }
            else {
                number = number * 3 + 1
            }
          steps++
        }
        return steps
    }
}
