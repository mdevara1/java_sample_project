package com.example.Jenkins_demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hellocontroller {

    @RequestMapping("/")
    public String hello(){
        return "hello world from docker" ;
    }
}
