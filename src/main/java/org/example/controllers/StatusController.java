package org.example.controllers;

import org.springframework.boot.web.client.RestTemplateBuilder;
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
        ResponseEntity<String> itemResponse = new RestTemplateBuilder().build().getForEntity("http://localhost:2962/item-health", String.class);
        ResponseEntity<String> userResponse = new RestTemplateBuilder().build().getForEntity("http://localhost:2962/user-health", String.class);
        ResponseEntity<String> eventResponse = new RestTemplateBuilder().build().getForEntity("http://localhost:2962/event-health", String.class);

        return ResponseEntity.status(
                        itemResponse.getStatusCode().is2xxSuccessful() &&
                        userResponse.getStatusCode().is2xxSuccessful() &&
                        eventResponse.getStatusCode().is2xxSuccessful() ? 200 : 400
        ).body(String.format("{Item-Service:%s,User-Service:%s,Event-Service:%s}",
                itemResponse.getStatusCode().value(),
                userResponse.getStatusCode().value(),
                eventResponse.getStatusCode().value()));
    }
}
