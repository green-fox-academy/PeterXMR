package com.greenfox.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;


@Controller
public class FirstController {

@Autowired
UtilityService service;


    @GetMapping("/useful")
    public String anothers (Model model) {
        return "useful";
    }

    @GetMapping("/useful/colored")
    public String another(Model model) {
        model.addAttribute( "colors", service.randomColor());
        return "usefulcolored";
    }

    @GetMapping("/useful/email")
    public String stringmodels (Model model,String email) {
    model.addAttribute( "email", service.validateEmail( email ));
    model.addAttribute( "input",email );
        return "usefulemail";
    }

    @GetMapping("/CaesarEncoder")
    public String anotherStr (Model model,String text, int number) {
        model.addAttribute( "textforencoding", service.caesarEndocing(text,number));
        model.addAttribute( "textfordecoding",service.caesarDeocing(text,number));

        return "caesarencoder";
    }
}
