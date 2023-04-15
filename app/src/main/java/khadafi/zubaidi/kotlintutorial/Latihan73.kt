package khadafi.zubaidi.kotlintutorial

fun main() {
    val time = 20
    val greeting = if (time < 18) {
        "Good day."
    } else {
        "Good evening."
    }
    println(greeting)
    //Note that if is in lowercase letters. Uppercase letters (If or IF) will generate an error.
}