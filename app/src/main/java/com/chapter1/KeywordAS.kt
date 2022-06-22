package com.chapter1

import com.chapter1.packageA.SameClass as ClassA
import com.chapter1.packageB.SameClass

fun main(args: Array<String>) {
    ClassA.methodA();
    SameClass.methodB();
}