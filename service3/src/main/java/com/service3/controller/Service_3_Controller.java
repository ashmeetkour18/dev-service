package com.service3.controller;

import com.service3.model.JSON;
import com.service3.service.Service_3;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Service_3_Controller {
    @Autowired
    private Service_3 service_3;

    @PostMapping("/service-3")
    public ResponseEntity<String> postService(@RequestBody JSON json) {
        return service_3.postService(json);
    }
}
