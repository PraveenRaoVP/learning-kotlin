package com.sample.learning

val initNew: Int by lazy {
    println("Initializing new");
    10;
}

fun main() {
    println(initNew);
    println(initNew);
}