package com.sample.learning

abstract class Shape {
    abstract fun area(): Double;
}

class Circle(private val rad: Double): Shape() {
    override fun area(): Double = Math.PI * rad * rad;
}

fun main() {
    val circle: Shape = Circle(10.0);
    println("Area of circle: ${circle.area().toInt()}");
}