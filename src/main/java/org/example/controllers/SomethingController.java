package org.example.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class SomethingController {

    //<editor-fold desc="Event">
    @GetMapping(value = "/get-event")
    public ResponseEntity<String> getEvent() {
        return ResponseEntity.status(501).body("to be implemented");
    }

    @GetMapping(value = "/get-events")
    public ResponseEntity<String> getEvents() {
        return ResponseEntity.status(501).body("to be implemented");
    }

    @PutMapping(value = "/add-event")
    public ResponseEntity<String> addEvent() {
        return ResponseEntity.status(501).body("to be implemented");
    }

    @PutMapping("/update-event")
    public ResponseEntity<String> updateEvent() {
        return ResponseEntity.status(501).body("to be implemented");
    }

    @DeleteMapping("/remove-event")
    public ResponseEntity<String> removeEvent() {
        return ResponseEntity.status(501).body("to be implemented");
    }
    //</editor-fold>

    //<editor-fold desc="Item">
    @GetMapping(value = "/get-item")
    public ResponseEntity<String> getItem() {
        return ResponseEntity.status(501).body("to be implemented");
    }

    @GetMapping(value = "/get-items")
    public ResponseEntity<String> getItems() {
        return ResponseEntity.status(501).body("to be implemented");
    }

    @PutMapping(value = "/add-item")
    public ResponseEntity<String> addItem() {
        return ResponseEntity.status(501).body("to be implemented");
    }

    @PutMapping("/update-item")
    public ResponseEntity<String> updateItem() {
        return ResponseEntity.status(501).body("to be implemented");
    }

    @DeleteMapping("/remove-item")
    public ResponseEntity<String> removeItem() {
        return ResponseEntity.status(501).body("to be implemented");
    }
    //</editor-fold>

    //<editor-fold desc="User">
    @GetMapping(value = "/get-user")
    public ResponseEntity<String> getUser(UUID id) {
        return ResponseEntity.status(501).body("to be implemented");
    }

    @GetMapping(value = "/get-users")
    public ResponseEntity<String> getUsers() {
        return ResponseEntity.status(501).body("to be implemented");
    }

    @PutMapping(value = "/add-user")
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
    //</editor-fold>

    @GetMapping("/health-event")
    public ResponseEntity<String> healthEvent() {
        return ResponseEntity.status(200).body("Events -> UP");
    }
}
