package qa.meerim.controllers;

import org.springframework.web.bind.annotation.*;
import qa.meerim.models.Task;
import qa.meerim.services.TaskService;

import java.util.List;

// API layer
@RestController
public class TaskController {

    private TaskService taskService;

    public TaskController() {
        taskService = new TaskService();
    }

    @GetMapping("/")
    public List<Task> getAllTasks() {
        return taskService.getTodoList();
    }

    @PostMapping("/")
    public Task addTask(@RequestBody Task task) {
        return taskService.addTask(task);
    }

    @GetMapping("/{taskIndex}")
    public Task getTaskByIndex(@PathVariable int taskIndex) {
        return taskService.getTask(taskIndex);
    }

    @PutMapping("/{taskIndex}")
    public Task updateTaskByIndex(@PathVariable int taskIndex, @RequestBody Task updatedTask) {
        return taskService.updateTask(taskIndex, updatedTask);
    }

    @DeleteMapping("/{taskIndex}")
    public Task deleteTask(@PathVariable int taskIndex) {
        return taskService.deleteTask(taskIndex);
    }
}
