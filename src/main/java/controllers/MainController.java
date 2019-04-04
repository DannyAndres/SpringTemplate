package com.example.controllers;

import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;

@RestController
public class MainController {
    
    @GetMapping("/")
    public String index() {
        return "Greetingsdsfsdgds from Spring Boot!";
    }
    
   	@GetMapping("/test/{id}")
    public String test(@PathVariable String id) {
        return id;
    };

    @PostMapping("/post")
    public String post(@Valid @RequestBody String name) {
        return name;
    };
}
