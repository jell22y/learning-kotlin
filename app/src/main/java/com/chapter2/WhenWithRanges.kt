package com.chapter2

fun main(args: Array<String>) {
    val x = Number(3, 5)
    when (x.valueX) {
        12 -> println("x is equal to 12")
        4 -> println("x is equal to 4")
        in (1..3) -> println("x lies between 1 to 3")
        !in (1..3) -> println("x does not lie between 1 to 3")
        checkNumber(x.valueX) -> println("checkNumber")
        else -> println("no conditions match!")
    }
}

data class Number(val valueX: Int, val valueY: Int)

fun checkNumber(a: Int): Int {
    return if (a in (15..25)) a else 0
}
