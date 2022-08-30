package com.service1.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.service1.model.JSON;
import com.service1.model.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@org.springframework.stereotype.Service
public class Service {
    @Autowired
    private RestTemplate restTemplate;

    public ResponseEntity<String> getStatus() {
        return new ResponseEntity<>("UP", HttpStatus.OK);
    }

    public ResponseEntity<?> consumeServices() {
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> httpEntity = new HttpEntity<>(httpHeaders);
        ResponseEntity<String> entity = restTemplate.exchange("http://localhost:8081/service-2", HttpMethod.GET, httpEntity, String.class);
        HttpHeaders httpHeaders_ = new HttpHeaders();


        String name= restTemplate.postForObject("http://localhost:8080/service-3",
                JSON.builder().name("John").surName("Deo").build(), String.class);




        return new ResponseEntity<>(entity.getBody() + " " +name, HttpStatus.OK);

    }
}
