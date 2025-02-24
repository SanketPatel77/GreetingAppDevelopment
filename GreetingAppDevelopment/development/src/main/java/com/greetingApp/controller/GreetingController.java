package com.greetingApp.controller;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

    // Handle GET request
    @GetMapping
    public Map<String, String> getGreeting() {
        Map<String, String> response = new HashMap<>();
        response.put("message", "Hello, this is a GET request");
        return response;
    }

    // Handle POST request
    @PostMapping
    public Map<String, String> postGreeting(@RequestBody Map<String, String> body) {
        Map<String, String> response = new HashMap<>();
        response.put("message", "Hello, this is a POST request");
        response.put("dataReceived", body.toString());
        return response;
    }

    // Handle PUT request
    @PutMapping
    public Map<String, String> putGreeting(@RequestBody Map<String, String> body) {
        Map<String, String> response = new HashMap<>();
        response.put("message", "Hello, this is a PUT request");
        response.put("updatedData", body.toString());
        return response;
    }

    // Handle DELETE request
    @DeleteMapping
    public Map<String, String> deleteGreeting() {
        Map<String, String> response = new HashMap<>();
        response.put("message", "Hello, this is a DELETE request");
        return response;
    }
}
