package com.sample.assignment.mastermind

fun findCharsInSamePlace(s1: String, s2: String): Int {
    var count = 0;
    val smallString: String = if(s1.length < s2.length) s1 else s2;
    for(i in smallString.indices) {
        if(s1[i] == s2[i]) {
            count++;
        }
    }
    return count;
}

fun findCommonChars(s1: String, s2: String): Int {
    var count = 0;
    val map: MutableMap<Char, Int> = s1.groupingBy { it }.eachCount().toMutableMap();
    for(ch in s2) {
        if(map.containsKey(ch) && map[ch]!! > 0) {
            count++;
            map[ch] = map[ch]!! -1;
        }
        if(map[ch] == 0) {
            map.remove(ch);
        }
    }
    return count;
}

fun main() {
    println("Hello, Mastermind!")
    print("Enter first string: ");
    val s1: String = readlnOrNull().toString();
    print("Enter second string: ");
    val s2: String = readlnOrNull().toString();
    val noOfCommonChars: Int = findCommonChars(s1, s2);
    val noOfCharsInSamePlace: Int = findCharsInSamePlace(s1, s2);
    println("Number of common characters: $noOfCommonChars");
    println("Number of characters in the same place: $noOfCharsInSamePlace");
}