fun task3() {
    val weatherToday = true
    val tentStatus = true
    val humidity = 20
    val timeOfYear = "Зима"
    println("Благоприятны ли сейчас условия для роста бобовых: " +
            "${weatherToday && tentStatus &&  humidity == 20 && timeOfYear != "Зима" }")
}