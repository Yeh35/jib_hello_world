package com.yeh35.jib.hellowrold.spring.boot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @GetMapping("/")
    public String index() {
        return "HI \n you only can move to '/hello'";
    }

    @GetMapping("/hello")
    public String helloWorld() {
        return "HelloWorld";
    }
}
