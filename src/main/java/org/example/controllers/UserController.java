package org.example.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/get-users")
    public String getUsers() {
        return "to be implemented";
    }

    @PostMapping("/add-users")
    public String addUsers() {
        return "to be implemented";
    }
}
