package com.fdcend.spring.security.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@PreAuthorize("denyAll()")
public class HelloWorldController {

    @GetMapping("/helloSec")
    @PreAuthorize("hasAuthority('READ')")
    public String secHelloWorld(){
        return "hello world - full security";
    }

    @GetMapping("/helloNoSec")
    @PreAuthorize("permitAll()")
    public String noSecHelloWorld(){
        return "hello world - no security";
    }

}
