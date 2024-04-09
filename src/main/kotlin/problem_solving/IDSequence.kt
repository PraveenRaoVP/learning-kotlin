package com.sample.problem_solving

import java.util.Stack

fun idSequence(str: String): String {
    val result = StringBuilder();
    var count = 1;
    val stack = Stack<Int>();
    for(i in 0..str.length) {
        stack.push(i+1);
        if(i==str.length || str[i] == 'I') {
            while(!stack.isEmpty()) {
                result.append(stack.pop());
            }
        }
    }
    return result.toString();
}

fun main() {
    println(idSequence("DDDD"));
}