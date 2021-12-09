package qa.meerim.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {
    @GetMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @GetMapping("/meri")
    public String meriGet() {
        return "Hi, my name is Meri and this is a GET request";
    }

    @PostMapping("/meri")
    public String meriPost() {
        return "Hi, my name is Meri and this is a POST request";
    }

    @PutMapping("/meri")
    public String meriPut() {
        return "Hi, my name is Meri and this is a PUT request";
    }

    @DeleteMapping("/meri")
    public String meriDelete() {
        return "Hi, my name is Meri and this is a DELETE request";
    }

}
