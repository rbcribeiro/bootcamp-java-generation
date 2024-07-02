package com.generation.helloworld.controller;

import com.generation.helloworld.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloWorldController {

    @Autowired
    private MyService myService;

    @GetMapping("/hello-world")
    public String helloWorld() {
        return "Hello World";
    }

    @GetMapping("/bsms")
    public List<String> listBsms() {
        return myService.getBsms();
    }

    @GetMapping("/objetivos-aprendizagem")
    public List<String> listObjectives() {
        return myService.getObjectives();
    }
}