package khadafi.zubaidi.kotlintutorial

class Car2(var brand: String, var model: String, var year: Int)

fun main() {
    val c1 = Car2("Ford", "Mustang", 1969)
    println(c1.brand)
    println(c1.model)
    println(c1.year)
}

