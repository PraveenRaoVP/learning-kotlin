package com.sample.learning

data class Employee(val name: String, val age: Int) {
}

fun isEven(i: Int): Boolean = i%2==0;
fun main() {
    val employees: List<Employee> = listOf(Employee("Alice", 20), Employee("Bob", 30), Employee("Charlie", 40));
    println(employees.filter { it.age >= 30}
        .map { it.name }
        .reduce { acc, s -> "$acc, $s" }
    ) // returns Bob, Charlie
    println(employees.filter { it.age >= 30 }.joinToString(", ") { it.name }
    ) // returns Bob, Charlie
    println(employees.any { it.age >= 30 }) // returns true
    println(employees.all { it.age >= 30 }) // returns false
    println(employees.firstOrNull { it.age >= 30 }?.name); // returns the first employee with age >= 30
    println(employees.groupBy { it.age }); // produces a map of age to list of employees
    println(employees.filter { it.age >= 30}.groupBy { it.age }.mapValues { it -> it.value.map { it.name } }); // produces a map of age to list of names
    println(employees.associateBy { it.age }); // produces a map of age to employee object - associateBy is a shorthand for groupBy { it.age }.mapValues { it.value.first() } which means that the duplicate keys are not allowed
    println(employees.flatMap { listOf(it.name, it.age) }); // returns a list of names and ages
    println(employees.maxBy(Employee::age)) // or prinltn(employees.maxBy { it.age }) - returns the employee with the maximum age
    val isEven: (Int) -> Boolean = { it%2 == 0}; // lambda function to check if a number is even. The type of the lambda function is (Int) -> Boolean
    println(listOf(1, 2, 3, 4, 5).filter(isEven).toString()); // returns [2, 4] - filter is a higher order function that takes a lambda function as an argument and returns a list of elements that satisfy the condition in the lambda function
    run { println(listOf(1,2,3,4,5).filter(isEven).toString()) } // run is a function that takes a lambda function as an argument and executes it. It is used to group a set of statements together
    val predicate = isEven; // predicate is a variable of type (Int) -> Boolean
    println(predicate(2));
}