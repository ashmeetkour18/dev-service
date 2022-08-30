package com.service1.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Service_2_Controller {

    @GetMapping("/service-2")
    public ResponseEntity<String> get() {
        return new ResponseEntity<>("Hello", HttpStatus.OK);
    }

}
