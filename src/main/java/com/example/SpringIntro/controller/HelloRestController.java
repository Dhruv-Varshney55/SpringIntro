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

    // uc2
    /* RequestParam -@RequestParam annotation to bind Servlet request parameters (that is, query parameters or form data) to a method argument in a controller.
      return-Hello (name) from Bridgelabz
      api- http://localhost:8080/hello/query?name=Dhruv */
    @GetMapping("/query")
    public String sayHello(@RequestParam String name) {
        return "Hello " + name + " from Bridgelabz!";
    }
}
