package com.chapter3

abstract class AbstractClass_Human {
    init {
        println ("Hi human")
    }
    fun Age(age: Int): String {
        return "I'm $age years old"
    }
    abstract fun say(word: String)
}

class AbstractClass_Man : AbstractClass_Human() {
    init {
        println ("Hi man")
    }
    override fun say(word: String) {
        println (word);
    }
}

fun main(args: Array<String>) {
    var x = AbstractClass_Man()
    x.say("Hello")
    println (x.Age(10));
}

/* Result
fun main(args: Array<String>) {
    var a : Any = 1
    var b = a as String
    // ClassCastException

    var c : Any = "1"
    var d = c as String
    println(d.length)
    // 1
}
*/