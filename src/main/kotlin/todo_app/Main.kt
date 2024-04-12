package com.sample.todo_app


fun main() {
    while(true) {
        println("1. Create new task");
        println("2. View all tasks");
        println("3. View important tasks");
        println("4. View normal tasks");
        println("5. Delete task");
        println("6. Make task important");
        println("7. Complete task");
        println("8. View completed tasks");
        println("9. Exit");
        println("Enter your choice: ");
        val choice = readlnOrNull()!!.toInt();
        when(choice) {
            1 -> createNewTask();
            2 -> getAllTasks();
            3 -> getImportantTasksView();
            4 -> getNormalTasksView();
            5 -> deleteTaskView();
            6 -> makeTaskImportantView();
            7 -> completeTaskView();
            8 -> viewCompletedTasksView();
            9 -> return;
            else -> println("Invalid choice");
        }
    }
}