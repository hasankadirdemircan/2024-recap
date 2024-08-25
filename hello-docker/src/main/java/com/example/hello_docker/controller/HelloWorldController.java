package com.example.hello_docker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/docker")
public class HelloWorldController {

    @GetMapping("/hello")
    public String hello() {
        return "hello world!";
    }
}
