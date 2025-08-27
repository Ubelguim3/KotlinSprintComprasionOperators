package org.example.Lesson4

fun task5() {
    println("Введите информацию о повреждениях в формате True или False")
    val damageInput = readln()
    val damage = damageInput.toBoolean()
    println("Введите количество членов экипажа")
    val numberOfCrewInput = readln()
    val numberOfCrew = numberOfCrewInput.toInt()
    println("Введите количество коробок с провизией")
    val boxesOnBoardInput = readln()
    val boxesOnBoard = boxesOnBoardInput.toInt()
    println("Введите информацию о погодных условиях в формате True или False")
    val weatherInput = readln()
    val weather = weatherInput.toBoolean()

    val result =
        ((damage) && (numberOfCrew in (55..70)) && (boxesOnBoard > 50))
                || ((!damage) && (numberOfCrew == 70) && (boxesOnBoard >= 50) && (weather))

    println("Может ли научно-исследовательский корабль приступить к долгосрочному плаванию: $result")
}

fun main() {
    task5()
}