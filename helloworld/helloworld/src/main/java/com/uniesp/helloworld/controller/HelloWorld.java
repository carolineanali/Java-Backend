package com.uniesp.helloworld.controller;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class HelloWorld {

    @RequestMapping("/helloworld")
    public String helloWorld(){
        return "Hello, World! :)";
    }
}

