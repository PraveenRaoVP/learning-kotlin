package com.sample.learning

fun duplicateNonZero(list: List<Int>): List<Int> {
    return list.flatMap {
        if(it == 0) listOf();
        else listOf(it, it);
    }
}

fun main() {
    println(duplicateNonZero(listOf(1, 2, 3, 0, 4, 5)));
}