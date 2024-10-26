package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class MessageController {


    @Value("${spring.security.user.name}")
    private String messageValue;

    @GetMapping("/message/{name}")
    public String message(@PathVariable String name) {
        return "name : " + name + " messageValue : " + messageValue + " message : ";
    }
    
}
