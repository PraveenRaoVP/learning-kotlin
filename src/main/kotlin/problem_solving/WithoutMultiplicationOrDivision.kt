package com.sample.problem_solving

fun multiplyBy15(n: Int): Int {
    return (n shl 4)-n;
}

fun multiplyBy7Point5(n: Int): Int {
    return multiplyBy15(n) shr 1;
}

fun multiplyBy15DivideBy16(n: Int): Int {
    return multiplyBy15(n) shr 4;
}

fun main() {
    println(multiplyBy15(5));
    println(multiplyBy7Point5(10));
    println(multiplyBy15DivideBy16(20));
}