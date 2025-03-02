package com.example.SpringIntro.controller;

import org.springframework.web.bind.annotation.*;
import com.example.SpringIntro.dto.User;

@RestController
public class HelloRestController {

    // curl localhost:8080 -w "\n"
    //uc1
    @GetMapping(value = {"", "/", "/home"})
    public String sayHello() {
        return "Hello From BridgeLabz!";
    }
}
