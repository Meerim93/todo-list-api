package qa.meerim.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {
    @GetMapping("/") // localhost:8080/
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @GetMapping("/meri") // localhost:8080/meri
    public String meriGet() {
        return "Hi, my name is Meri and this is a GET request";
    }

    @PostMapping("/meri") // localhost:8080/meri
    public String meriPost() {
        return "Hi, my name is Meri and this is a POST request";
    }
    @PutMapping ("/meri") // localhost:8080/meri
    public String meriPut() {
        return "Hi, my name is Meri and this is a PUT request";
    }
    @DeleteMapping  ("/meri") // localhost:8080/meri
    public String meriDelete() {
        return "Hi, my name is Meri and this is a DELETE request";
    }

}
