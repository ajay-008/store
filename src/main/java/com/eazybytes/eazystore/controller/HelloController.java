package com.eazybytes.eazystore.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String sayHello(){
        System.out.println("Hello Java");
        return "Contact not found!";
    }

    @GetMapping("/hello")
    public String sayContact(){
        System.out.println("Using Stash");
        return "Stash usecase !";
    }
}
