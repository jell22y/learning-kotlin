package com.chapter2

fun main(args: Array<String>) {
    val numbers = arrayOf(5, 6, 7, 1, 3, 4, 5, 7, 12, 1)

    (0..9).asSequence().takeWhile {
        println("Inside takeWhile")
        it < numbers[it]
    }.forEach {
        println("Inside forEach")
    }

    println()

    (0..9).takeWhile {
        println("Inside takeWhile")
        it < numbers[it]
    }.forEach {
        println("Inside forEach")
    }
}