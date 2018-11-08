package com.greenfox.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class FirstController {

    @Autowired
    UtilityService service;

    @Autowired
    StudentService students;

    @GetMapping("/useful")
    public String anothers(Model model) {
        return "useful";
    }

    @GetMapping("/useful/colored")
    public String another(Model model) {
        model.addAttribute( "colors", service.randomColor() );
        return "usefulcolored";
    }

    @GetMapping("/useful/email")
    public String stringmodels(Model model, String email) {
        model.addAttribute( "email", service.validateEmail( email ) );
        model.addAttribute( "input", email );
        return "usefulemail";
    }

    @GetMapping("/useful/caesar")
    public String anotherStr(Model model, @RequestParam String text, @RequestParam int number) {
        model.addAttribute( "textforencoding", service.caesar( text, number ) );
        model.addAttribute( "textfordecoding", service.caesar( text, -number ) );
        model.addAttribute( "text", text );
        model.addAttribute( "number", number );
        return "caesarencoder";
    }

    @GetMapping("/gfa")
    public String anothergfa(Model model) {
        model.addAttribute( "counter",students.counter );
        return "gfa";
    }

    @GetMapping("/gfa/list")
    public String stringmodel(Model model) {
        model.addAttribute( "studentnames", students.findAll() );
        return "gfalist";
    }

    @PostMapping("gfa/save")
    public String stringmodels(String addStudent) {
        students.save( addStudent);
        return "redirect:/gfa/list";
    }

    @RequestMapping("/gfa/addstudent")
    public String stringmodels(Model model) {
        return "gfaadd";
    }

    @GetMapping("gfa/check")
    public String stringsmodel(Model model,String name) {
        model.addAttribute( "studentnames", students.findAll() );
        return "gfacheck";

    }
}