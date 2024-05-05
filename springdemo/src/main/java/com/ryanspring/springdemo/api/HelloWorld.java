package com.ryanspring.springdemo.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @RequestMapping( value = "/hello")
    public String sayHello(){
        return "Ryan Hello2";
    }
}
