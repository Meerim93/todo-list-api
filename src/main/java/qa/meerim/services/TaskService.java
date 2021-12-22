package qa.meerim.services;

import qa.meerim.models.Task;

import java.util.ArrayList;
import java.util.List;

// business logic layer
public class TaskService {
    private List<Task> todoList;

    public TaskService() {
        todoList = new ArrayList<>();
    }

    public List<Task> getTodoList() {
        return todoList;
    }

    public Task getTask(int index) {
        validateTaskIndex(index);
        return todoList.get(index);
    }

    public Task addTask(Task task) {
        todoList.add(task);
        return task;
    }

    public Task updateTask(int index, Task updatedTask) {
        validateTaskIndex(index);
        todoList.set(index, updatedTask);
        return updatedTask;
    }

    public Task deleteTask(int index) {
        validateTaskIndex(index);
        return todoList.remove(index);
    }

    protected void validateTaskIndex(int index) {
        if (index >= todoList.size()) {
            throw new IllegalArgumentException("The task at index " + index + " doesn't exist.");
        }
    }
}