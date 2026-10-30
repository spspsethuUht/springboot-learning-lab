package com.sethu.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {
        return "Home Page";
    }

    @GetMapping("/trainer")
    public String trainer() {
        return "Sethu is a Trainer";
    }

    @GetMapping("/spring")
    public String spring() {
        return "Learning Spring Boot";
    }

    @RequestMapping("/Hello")
    public String getUsers()
    {
        return "Hello Users";
    }

}