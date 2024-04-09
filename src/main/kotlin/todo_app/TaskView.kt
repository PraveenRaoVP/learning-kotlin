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
    when(taskType) {
        "1" -> {
            val taskId: Int = Repository.createTaskId();
            val task = ImportantTask(taskId,taskName, taskDescription, taskTiming);
            println(task);
        }
        "2" -> {
            val taskId: Int = Repository.createTaskId();
            val task = NormalTask(taskId,taskName, taskDescription, taskTiming);
            println(task);
        }
        else -> {
            println("Invalid task type");
        }
    }
    // add the task to the list of tasks
    // listOfTasks.add(task);
}

fun getImportantTasks() {
    println("Important tasks: ");
    lateinit var tasks: List<Task>;
    for(task in tasks) {
        if(task is ImportantTask) {
            println(task);
        }
    }
}
