package com.example;

@com.example.RestController

public class HelloController {
    @com.example.GetMapping("/hello")
    public String sayHello() {
        return "Hello, World!";
    }
}
