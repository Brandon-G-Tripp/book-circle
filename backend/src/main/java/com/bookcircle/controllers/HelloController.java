package com.bookcircle.controllers;

import org.springframework.web.bind.annotation.GeMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello() {
        return "Hello, World!";
    } 
} 
