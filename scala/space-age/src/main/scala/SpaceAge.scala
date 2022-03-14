object SpaceAge {
    val SECONDS_PER_YEAR_ON_EARTH = 31557600
    val ORBITAL_PERIOD_EARTH = 1.0
    val ORBITAL_PERIOD_MERCURY = 0.2408467
    val ORBITAL_PERIOD_VENUS = 0.61519726
    val ORBITAL_PERIOD_MARS = 1.8808158
    val ORBITAL_PERIOD_JUPITER = 11.862615
    val ORBITAL_PERIOD_SATURN = 29.447498
    val ORBITAL_PERIOD_URANUS = 84.016846
    val ORBITAL_PERIOD_NEPTUNE = 164.79132

    def onEarth(age: Double): Double = {
        age / ( SECONDS_PER_YEAR_ON_EARTH * ORBITAL_PERIOD_EARTH)
    }

    def onMercury(age: Double): Double = age / (ORBITAL_PERIOD_MERCURY * SECONDS_PER_YEAR_ON_EARTH)

    def onVenus(age: Double): Double = age / (ORBITAL_PERIOD_VENUS * SECONDS_PER_YEAR_ON_EARTH)

    def onMars(age: Double): Double = age / (ORBITAL_PERIOD_MARS * SECONDS_PER_YEAR_ON_EARTH)

    def onJupiter(age: Double): Double = age / (ORBITAL_PERIOD_JUPITER * SECONDS_PER_YEAR_ON_EARTH)

    def onSaturn(age: Double): Double = age / (ORBITAL_PERIOD_SATURN * SECONDS_PER_YEAR_ON_EARTH)

    def onUranus(age: Double): Double = age / (ORBITAL_PERIOD_URANUS * SECONDS_PER_YEAR_ON_EARTH)

    def onNeptune(age: Double): Double = age / (ORBITAL_PERIOD_NEPTUNE * SECONDS_PER_YEAR_ON_EARTH)

}