package com.chapter3

fun main(args: Array<String>) {
    var a : Any = 1

    // is
    if (a is String) {
        println("a = $a is String")
    }
    else {
        println("a = $a is not String")
    }

    // !is
    if (a !is String) {
        println("a = $a is not String")
    }
    else {
        println("a = $a is String")
    }
}