package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheck {

    @GetMapping("/healthcheck")
    public String heathCheck() {
        System.out.println("system is healthy");
        return "200";
    }
}
