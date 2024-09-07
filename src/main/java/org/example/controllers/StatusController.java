package org.example.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusController {

    @GetMapping("/health-main")
    public ResponseEntity<String> mainHealth() {
        return ResponseEntity.status(200).body("Main Server -> UP");
    }

    @GetMapping("/health")
    public ResponseEntity<String> health() {
        return ResponseEntity.status(501).body("to be implemented");
    }
}
