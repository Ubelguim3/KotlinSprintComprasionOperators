fun task4() {
    var trainingDay = 5
    println("""
Упражнения для рук:    ${trainingDay % 2 != 0 && trainingDay > 0}
Упражнения для ног:    ${trainingDay % 2 == 0 && trainingDay > 0} 
Упражнения для спины:  ${trainingDay % 2 == 0 && trainingDay > 0}
Упражнения для пресса: ${trainingDay % 2 != 0 && trainingDay > 0}
""".trimIndent())
}

fun main() {
    task4()
}