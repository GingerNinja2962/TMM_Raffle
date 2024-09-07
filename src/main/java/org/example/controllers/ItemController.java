package org.example.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ItemController {

    @GetMapping("/get-item")
    public ResponseEntity<String> getItem() {
        return ResponseEntity.status(501).body("to be implemented");
    }

    @GetMapping("/get-items")
    public ResponseEntity<String> getItems() {
        return ResponseEntity.status(501).body("to be implemented");
    }

    @PostMapping("/add-item")
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

    @GetMapping("/health-item")
    public ResponseEntity<String> healthItem() {
        return ResponseEntity.status(200).body("Items -> UP");
    }
}
