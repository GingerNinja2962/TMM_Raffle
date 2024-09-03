package org.example.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class EventController {

    @GetMapping("/get-event")
    public ResponseEntity<String> getEvents() {
        return ResponseEntity.status(501).body("to be implemented");
    }

    @PostMapping("/add-event")
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

    @GetMapping("/health-event")
    public ResponseEntity<String> healthEvent() {
        return ResponseEntity.status(200).body("Events -> UP");
    }
}
