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
      api- http://localhost:8080/query?name=Dhruv */
    @GetMapping("/query")
    public String sayHello(@RequestParam String name) {
        return "Hello " + name + " from Bridgelabz!";
    }

    // uc3
    /* RequestParam -@RequestParam annotation to bind Servlet request parameters (that is, query parameters or form data) to a method argument in a controller.
      return-Hello (name) from Bridgelabz
      api- http://localhost:8080/params/dhruv */
    @GetMapping("/params/{name}")
    public String sayHelloPathVariable(@PathVariable String name) {
        return "Hello " + name + " from Bridgelabz!";
    }

    // uc4
    /* RequestParam -@PostMapping annotation to bind Servlet request parameters (that is, query parameters or form data) to a method argument in a controller.
       return-Hello (firstName) (lastName) from Bridgelabz
       api- http://localhost:8080/post (with custom provided firstName and lastName) */
    @PostMapping("/post")
    public String sayHelloPost(@RequestBody User user) {
        return "Hello " + user.getFirstName() + " " + user.getLastName() + " from Bridgelabz!";
    }

    // uc5
    // curl -X PUT localhost:8080/put/Lisa/?lastName=Terrisa -w "\n"
    @PutMapping("/put/{firstName}")
    public String sayHello(@PathVariable String firstName, @RequestParam(value = "lastName") String lastName) {
        return "Hello " + firstName + " " + lastName + "!";
    }
}
