package com.greenfox.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicLong;


@RestController
public class HelloRESTController {


    public static final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Greeting greeting (@RequestParam(value = "name", defaultValue = "Your name") String name){
        return new Greeting( counter.incrementAndGet(),name );
    }
}