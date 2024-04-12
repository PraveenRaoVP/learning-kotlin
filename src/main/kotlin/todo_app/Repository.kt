package com.sample.todo_app

object Repository {
    // counter which will assign taskId to each task
    private var counter: Int = 0;
    private val tasks: MutableMap<Int, Task> = mutableMapOf();
    private val completedTasks: MutableMap<Int, Task> = mutableMapOf();

    fun addTask(task: Task) {
        tasks[task.taskId] = task;
    }

    fun createTaskId(): Int {
        return ++counter;
    }

    fun getTasks(): List<Task> {
        return tasks.values.toList();
    }

    fun getImportantTasks(): List<Task> {
        return tasks.values.filterIsInstance<ImportantTask>();
    }

    fun getNormalTasks(): List<Task> {
        return tasks.values.filterIsInstance<NormalTask>();
    }

    fun getTaskById(taskId: Int): Task? {
        return tasks[taskId];
    }

    fun deleteTask(taskId: Int): Boolean {
        return tasks.remove(taskId)!=null;
    }

    fun makeTaskImportant(taskId: Int) {
        val task = tasks[taskId];
        if (task is NormalTask) {
            tasks[taskId] = ImportantTask(task.taskId, task.taskHeading, task.taskDescription, task.timing);
        }
    }

    fun completeTask(taskId: Int): Boolean {
        val task = tasks[taskId];
        if (task != null) {
            completedTasks[taskId] = task;
            tasks.remove(taskId);
            return true;
        } else {
            return false;
        }
    }

    fun viewCompletedTasks(): List<Task> {
        return completedTasks.values.toList();
    }

    fun checkIfTaskCompleted(taskId: Int): Boolean {
        return completedTasks.containsKey(taskId);
    }
}