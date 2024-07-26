package com.fdcend.spring.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/helloSec")
    public String secHelloWorld(){
        return "hello world - full security";
    }

    @GetMapping("/helloNoSec")
    public String noSecHelloWorld(){
        return "hello world - no security";
    }

}
