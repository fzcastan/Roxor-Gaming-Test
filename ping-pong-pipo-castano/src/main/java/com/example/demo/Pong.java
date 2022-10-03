package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class Pong {

    @RequestMapping(path = "/ping")
    public String getGreeting(){

        return "pong";
    }

}
