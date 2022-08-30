package com.service3.service;

import com.service3.model.JSON;
import com.service3.model.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class Service_3 {

    public ResponseEntity<String> postService(JSON json) {
        return new ResponseEntity<String>(json.getName() + " " + json.getSurName(),
                HttpStatus.OK);
    }
}
