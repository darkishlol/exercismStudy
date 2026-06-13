object Darts {

    fun score(x: Number, y: Number): Int {
        val xDouble = x.toDouble()
        val yDouble = y.toDouble()
        
        val distanceSquared = xDouble * xDouble + yDouble * yDouble

        return when {
            distanceSquared <= 1.0 -> 10
            distanceSquared <= 25.0 -> 5
            distanceSquared <= 100.0 -> 1
            else -> 0
        }
    }
}
