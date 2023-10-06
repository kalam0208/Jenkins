package com.Natwest.Jenkinsspringboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Jenkinscontroller {
    @GetMapping("/jenkins")
    public String get(){
        return "Hi every one welcome to natwest";
    }

}
