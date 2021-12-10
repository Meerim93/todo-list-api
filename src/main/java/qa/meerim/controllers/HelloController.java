package qa.meerim.controllers;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HelloController {

    private List<String> todoList;

    public HelloController() {
        todoList = new ArrayList<>();
    }

    @GetMapping("/{taskIndex}")
    public String getTaskByIndex(@PathVariable int taskIndex) {
        if (taskIndex >= todoList.size()) {
            return "The task at this index doesn't exist";
        } else {
            return todoList.get(taskIndex);
        }
    }

    @PostMapping("/")
    public String addTask(@RequestBody String task) {
        todoList.add(task);
        return task;
    }
}
