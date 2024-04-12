package com.sample.todo_app

// interface Task contains taskHeading, taskDescription, timing , and child classes ImportantTask and NormalTask
interface Task {
    val taskId: Int
    val taskHeading: String
    val taskDescription: String
    val timing: String
}

// class ImportantTask implements Task
data class ImportantTask(override val taskId: Int, override val taskHeading: String, override val taskDescription: String, override val timing: String): Task {
    // override toString() method to return taskHeading, taskDescription, and timing
    override fun toString(): String {
        return "\n------------------------------------\n***\nTaskId: $taskId\nTask Heading: $taskHeading\nTask Description: $taskDescription\nTiming: $timing\n" +
                "------------------------------------\n"
    }
}

// class NormalTask implements Task
data class NormalTask(override val taskId: Int, override val taskHeading: String, override val taskDescription: String, override val timing: String): Task {
    // override toString() method to return taskHeading, taskDescription, and timing
    override fun toString(): String {
        return "\n" +
                "------------------------------------\nTaskId: $taskId\nTask Heading: $taskHeading\nTask Description: $taskDescription\nTiming: $timing\n" +
                "------------------------------------\n"
    }
}