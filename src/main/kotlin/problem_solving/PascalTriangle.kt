package com.sample.problem_solving

fun factorial(n: Int): Int {
    if(n==0) return 1;
    return n*factorial(n-1);
}

fun pascalTriangle(n: Int) {
    for(i in 0..<n) {
        for(j in 0..n-i) {
            print(" ");
        }
        for(j in 0..i) {
            print("${(factorial(i)/(factorial(j)*factorial(i-j)))} ");
        }
        println();
    }
}

fun main() {
    pascalTriangle(5);
}