package com.chapter3

fun main(args: Array<String>) {
    var a : Any = 1
    var b = a as String
    // ClassCastException

    var c : Any = "1"
    var d = c as String
    println(d.length)
    // 1
}