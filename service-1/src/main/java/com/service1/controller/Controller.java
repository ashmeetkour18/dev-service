package com.service1.controller;

import com.service1.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Autowired
    private Service service;

    @GetMapping("/service1")
    public ResponseEntity<String> getStatus() {
        return service.getStatus();
    }

    @PostMapping("/service1")
    public ResponseEntity<?> consume() {
        return service.consumeServices();
    }

}
