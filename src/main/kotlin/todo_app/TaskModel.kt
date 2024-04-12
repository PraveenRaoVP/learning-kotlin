package com.sample.todo_app

fun createTask(taskHeading: String, taskDescription: String, taskTiming: String, taskType: String?) {
    val taskId: Int = Repository.createTaskId();
    val task = when(taskType) {
        "1" -> ImportantTask(taskId, taskHeading, taskDescription, taskTiming);
        "2" -> NormalTask(taskId, taskHeading, taskDescription, taskTiming);
        else -> throw IllegalArgumentException("Invalid task type");
    }
    Repository.addTask(task);
}

fun getTasks(): List<Task> {
    return Repository.getTasks();
}

fun getImportantTasks(): List<Task> {
    return Repository.getImportantTasks();
}

fun getNormalTasks(): List<Task> {
    return Repository.getNormalTasks();
}

fun deleteTask(taskId: Int): Boolean {
    return Repository.deleteTask(taskId);
}

fun makeTaskImportant(taskId: Int) {
    Repository.makeTaskImportant(taskId);
}

fun completeTask(taskId: Int): Boolean {
    return Repository.completeTask(taskId);
}

fun viewCompletedTasks(): List<Task> {
    return Repository.viewCompletedTasks();
}

fun checkIfTaskCompleted(taskId: Int): Boolean {
    return Repository.checkIfTaskCompleted(taskId);
}