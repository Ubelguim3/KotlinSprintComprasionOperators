const val NUMBER_OF_TABLES = 13

fun task1() {
    val tablesBookedToday = 13
    val tablesBookedTomorrow = 9
    println("Доступность столиков на сегодня: ${tablesBookedToday < NUMBER_OF_TABLES}\n" +
          "Доступность столиков на сегодня: ${tablesBookedTomorrow < NUMBER_OF_TABLES}")
}

fun main() {
    task1()
}