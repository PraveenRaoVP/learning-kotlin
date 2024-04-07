package com.sample.learning

enum class COLOR {
    RED, GREEN, BLUE
}

fun calculateWeather(temp: Int): String {
    val (description: String, color: COLOR) = when {
        temp < 10 -> "cold" to COLOR.BLUE
        temp < 25 -> "mild" to COLOR.GREEN
        else -> "hot" to COLOR.RED
    }

    return "The weather is $description and the color is $color";
}

fun main() {
    println(calculateWeather(9))
    val arr: Array<String> = arrayOf("a", "b", "c");
    arr[0] = "d";
    arr.forEach { println(it) }
    println(max(10, 20))
}

fun max(a: Int, b: Int): Int = if (a>b) a else b;
