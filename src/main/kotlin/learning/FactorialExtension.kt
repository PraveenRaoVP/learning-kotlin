package com.sample.learning

fun Int.factorial(): Int {
    if(this <= 1) return 1;
    return this * (this-1).factorial();
}

fun Int.fibonacci(): List<Int> {
    val list = mutableListOf<Int>();
    for(i in 0..this) {
        list.add(if(i<=1) i else list[i-1]+list[i-2]);
    }
    return list;
}

fun main() {
    println(5.factorial());
    println(10.fibonacci());
}