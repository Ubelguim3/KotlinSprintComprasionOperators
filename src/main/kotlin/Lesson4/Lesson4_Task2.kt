package Lesson4

fun task2() {
    var weight = 20
    var capacity = 80
    println("Груз с весом $weight кг и объемом $capacity л соответствует категории 'Average': ${((weight > 35) and (weight <= 100))  && (capacity < 100)}")
    weight = 50
    capacity = 100
    println("Груз с весом $weight кг и объемом $capacity л соответствует категории 'Average': ${((weight > 35) and (weight <= 100))  && (capacity < 100)}")
}

fun main() {
    task2()
}