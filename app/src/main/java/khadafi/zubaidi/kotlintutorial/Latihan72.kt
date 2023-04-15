package khadafi.zubaidi.kotlintutorial

fun main() {
    val time = 22
    if (time < 10) {
        println("Good morning.")
    } else if (time < 20) {
        println("Good day.")
    } else {
        println("Good evening.")
    }
    // Outputs "Good evening."
    //Note that if is in lowercase letters. Uppercase letters (If or IF) will generate an error.
}