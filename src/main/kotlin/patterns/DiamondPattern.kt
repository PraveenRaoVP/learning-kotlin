package com.sample.patterns

/*
        n= 5
           *
          * *
         * * *
        * * * *
       * * * * *
        * * * *
         * * *
          * *
           *

 */

class DiamondPattern {
    fun printStarPattern(n: Int) {
        for(i in 1..<2*n) {
            val numStars = if(i<=n) i else 2*n-i;
            val numSpaces = n-numStars;
            repeat(numSpaces) {
                print(" ");
            }
            repeat(numStars) {
                print("* ");
            }
            println();
        }
    }
}

fun main() {
    val obj = DiamondPattern();
    obj.printStarPattern(5);
}