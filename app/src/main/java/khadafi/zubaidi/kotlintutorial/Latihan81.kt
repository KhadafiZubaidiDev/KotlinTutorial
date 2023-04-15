package khadafi.zubaidi.kotlintutorial

fun main() {
    val cars = arrayOf("Volvo", "BMW", "Ford", "Mazda")
    cars[0] = "Opel"
    println(cars[0])
    // Now outputs Opel instead of Volvo
}