package qa.meerim.controllers;

import org.springframework.web.bind.annotation.*;
import qa.meerim.models.Task;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TaskController {

    private List<Task> todoList;

    public TaskController() {
        todoList = new ArrayList<>();
    }

    @GetMapping("/")
    public List<Task> getAllTasks() {
        return todoList;
    }


    @PostMapping("/")
    public Task addTask(@RequestBody String text) {
        Task task = new Task(text);
        todoList.add(task);
        return task;
    }

    @GetMapping("/{taskIndex}")
    public Task getTaskByIndex(@PathVariable int taskIndex) {
        if (taskIndex >= todoList.size()) {
            throw new IllegalArgumentException("The task at index " + taskIndex + " doesn't exist.");
        } else {
            return todoList.get(taskIndex);
        }
    }

    @PostMapping("/{taskIndex}")
    public Task updateTaskByIndex(@PathVariable int taskIndex) {
        if (taskIndex >= todoList.size()) {
            throw new IllegalArgumentException("The task at index " + taskIndex + " doesn't exist.");
        } else {
            Task taskToUpdate = todoList.get(taskIndex);
            taskToUpdate.setIsCompleted(true);
            return taskToUpdate;
        }
    }

    @PutMapping("/{taskIndex}")
    public Task updateTaskByIndex(@PathVariable int taskIndex, @RequestBody String text) {
        if (taskIndex >= todoList.size()) {
            throw new IllegalArgumentException("The task at index " + taskIndex + " doesn't exist.");
        } else {
            Task taskToUpdate = todoList.get(taskIndex);
            taskToUpdate.setText(text);
            return taskToUpdate;
        }
    }

    // create an endpoint to delete a specific task
    // the method should return whether the task was deleted (true or false)
    @DeleteMapping("/{taskIndex}")
    public Task deleteTask(@PathVariable int taskIndex) {
        if (taskIndex >= todoList.size()) {
            throw new IllegalArgumentException("The task at " + taskIndex + " doesn't exist.");
        } else {
            Task taskToDelete = todoList.get(taskIndex);
            taskToDelete.setDeleted(true);
            return taskToDelete;
        }
    }
}
