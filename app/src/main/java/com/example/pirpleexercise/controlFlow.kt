package com.example.pirpleexercise

fun main() {
    val max = 100
    var current = 1

    while (current <= max) {
        when {
            current % 3 == 0 && current % 5 == 0 -> {
                println("FizzBuzz")
            }
            current % 3 == 0 -> {
                println("Fizz")
            }
            current % 5 == 0 -> {
                println("Buzz")
            }
            else -> {
                println(current)
            }
        }
        current++
    }

}
