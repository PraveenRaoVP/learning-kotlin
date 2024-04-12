package com.sample.todo_app

fun createNewTask() {
    println("Enter task name: ");
    val taskName = readlnOrNull()!!;
    println("Enter task description: ");
    val taskDescription = readlnOrNull()!!;
    println("Enter task timing: ");
    val taskTiming = readlnOrNull()!!;
    println("Enter task type (1. Important, 2. Normal): ");
    val taskType = readlnOrNull();
    createTask(taskName, taskDescription, taskTiming, taskType);
}

fun getImportantTasksView() {
    val tasks: List<Task> = getImportantTasks();
    if(tasks.isEmpty()) {
        println("No important tasks");
        return;
    }
    println("Important tasks: ");
    for(task in tasks) {
        println(task);
    }
}

fun getAllTasks() {
    val tasks = getTasks();
    if(tasks.isEmpty()) {
        println("No tasks");
        return;
    }
    for(task in tasks) {
        println(task);
    }
}

fun getNormalTasksView() {
    val tasks: List<Task> = getNormalTasks();
    if(tasks.isEmpty()) {
        println("No normal tasks");
        return;
    }
    println("Normal tasks: ");
    for(task in tasks) {
        println(task);
    }
}

fun deleteTaskView() {
    println("Enter task id to delete: ");
    val taskId = readlnOrNull()!!.toInt();
    if(deleteTask(taskId)) {
        println("Deleted Successfully");
    } else {
        println("Task not found");
    }
}

fun makeTaskImportantView() {
    println("Enter task id to make important: ");
    val taskId = readlnOrNull()!!.toInt();
    makeTaskImportant(taskId);
    println("Task converted to important task successfully");
}

fun viewCompletedTasksView() {
    val tasks = viewCompletedTasks();
    if(tasks.isEmpty()) {
        println("No tasks completed");
        return;
    }
    for(task in tasks) {
        println(task);
    }
}

fun completeTaskView() {
    println("Enter task id to complete: ");
    val taskId = readlnOrNull()!!.toInt();
    if(completeTask(taskId)) {
        println("Task completed successfully");
    } else {
        println("Task not found");
    }
}

fun checkIfTaskCompletedView() {
    println("Enter task id to check if completed: ");
    val taskId = readlnOrNull()!!.toInt();
    if(checkIfTaskCompleted(taskId)) {
        println("Task is completed");
    } else {
        println("Task is not completed");
    }
}