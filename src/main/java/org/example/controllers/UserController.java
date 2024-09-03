package org.example.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @GetMapping("/get-user")
    public ResponseEntity<String> getUsers() {
        return ResponseEntity.status(501).body("to be implemented");
    }

    @PostMapping("/add-user")
    public ResponseEntity<String> addUser() {
        return ResponseEntity.status(501).body("to be implemented");
    }

    @PutMapping("/update-user")
    public ResponseEntity<String> updateUser() {
        return ResponseEntity.status(501).body("to be implemented");
    }

    @DeleteMapping("/remove-user")
    public ResponseEntity<String> removeUser() {
        return ResponseEntity.status(501).body("to be implemented");
    }

    @GetMapping("/health-user")
    public ResponseEntity<String> healthUser() {
        return ResponseEntity.status(200).body("Users -> UP");
    }
}
