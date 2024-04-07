package com.sample

import com.sample.learning.calculateWeather;

// create a person class with name and age and check if they are adult or minor.
data class Person(private val name: String, private val age: Int) {

    fun getName(): String = name;
    fun getAge(): Int = age;
    fun isAdult(): Boolean = age >= 18;
}

fun displaySeparator(character: Char = '=', size: Int = 10) {
    repeat(size) {
        print(character);
    }
    println();
}

fun isValidIdentifier(s: String): Boolean {
    fun isValidChar(ch: Char): Boolean = ch=='_' || ch.isLetterOrDigit();
    if(s.isEmpty() || s[0] in '0'..'9') {
        return false;
    }
    for(ch in s) {
        if(!isValidChar(ch)) {
            return false;
        }
    }
    return true;
}

fun List<Int>.sum(): Int {
    var ans: Int = 0;
    for(i in this) {
        ans+=i;
    }
    return ans;
}

enum class Color {
    RED, GREEN, YELLOW, BLUE, VIOLET, INDIGO
}
// if c1 and c2 are equal return c1 else return a mix of c1 and c2
fun mix(c1: Color, c2: Color): Color = when(setOf(c1, c2)) {
        setOf(Color.RED, Color.GREEN) -> Color.YELLOW;
        setOf(Color.GREEN, Color.BLUE) -> Color.VIOLET;
        setOf(Color.BLUE, Color.RED) -> Color.INDIGO;
        else -> throw Exception("Dirty Color");
}

fun String.lastChar(): Char = this[this.length-1];

fun main() {;
//    println(isValidIdentifier("abc"));
//    println(isValidIdentifier("abc123"));
//    println(isValidIdentifier("123abc"));
//    println(isValidIdentifier("abc_123"));
//    println(isValidIdentifier("abc-123"));
//    println(isValidIdentifier("_123a"));
    println(listOf(1, 2, 3, 4, 5).max());
//    for(i in 9 downTo 1 step 2) {
//        println("Summa: $i");
//    }
//    val str: String = "Hello";
//    println(str.lastChar());
//    try {
//        println(mix(Color.GREEN, Color.GREEN));
//    } catch(e: Exception) {
//        println(e.message);
//    }
}