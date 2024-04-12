package com.sample.todo_app

fun createNormalTask(taskHeading: String, taskDescription: String, timing: String): Task {
    val taskId: Int = Repository.createTaskId();
    val task = NormalTask(taskId, taskHeading, taskDescription, timing);
    Repository.addTask(task);
    return task;
}