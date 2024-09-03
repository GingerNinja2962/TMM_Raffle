package org.example.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemController {

    @GetMapping("/get-items")
    public String getItems() {
        return "to be implemented";
    }

    @PostMapping("/add-item")
    public String addItem() {
        return "to be implemented";
    }
}
