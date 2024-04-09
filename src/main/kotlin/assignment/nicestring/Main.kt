package com.sample.assignment.nicestring

fun countVowels(str: String): Int {
    val vowels: Set<Char> = setOf('a','e','i','o','u');
    var count: Int = 0;
    for(ch in str) {
        if(vowels.contains(ch)) {
            count++;
        }
    }
    return count;
}

fun containsDoubleLetter(str: String): Boolean {
    for(i in str.indices) {
        if(i+1 < str.length && str[i] == str[i+1]) {
            return true;
        }
    }
    return false;
}

fun checkIfContainsBuBaBe(str: String): Boolean {
    return str.contains("bu") || str.contains("ba") || str.contains("be");
}

fun checkIfNiceString(str: String): Boolean {
    var satisfyingCount: Int = 0;
    if(countVowels(str) >= 3) {
        satisfyingCount++;
    }
    if(containsDoubleLetter(str)) {
        satisfyingCount++;
    }
    if(!checkIfContainsBuBaBe(str)) {
        satisfyingCount++;
    }
    if(satisfyingCount >= 2) {
        return true;
    }
    return false;
}

fun main() {
    println(checkIfNiceString("bac"));
    println(checkIfNiceString("baa"));
    println(checkIfNiceString("baaa"));
    println(checkIfNiceString("aaab"));
}