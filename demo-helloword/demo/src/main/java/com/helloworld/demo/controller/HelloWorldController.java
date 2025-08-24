package com.helloworld.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/")
    public String home() {
        return "Welcome! Use /hello to get HelloWorld (requires authentication).";
    }

    @GetMapping("/hello")
    public String helloWorld() {
        return "HelloWorld";
    }
}