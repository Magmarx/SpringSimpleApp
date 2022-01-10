package com.example.simplewebapplication;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {

    @RequestMapping("/")
    public String index() {
        return "Hello world!";
    }

    @RequestMapping("/test")
    public String index2() {
        return "This is a index test!";
    }
}
