package com.greenfox.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import static com.greenfox.controllers.HelloRESTController.counter;

@Controller
public class HelloWebController {

    @RequestMapping("/web/greeting")
    public String greeting(@RequestParam(value = "name", defaultValue = "Your name") String name ,Model model) {
        model.addAttribute( "name", name );
        model.addAttribute( "counter", counter.incrementAndGet() );
        return "greeting";
    }
}