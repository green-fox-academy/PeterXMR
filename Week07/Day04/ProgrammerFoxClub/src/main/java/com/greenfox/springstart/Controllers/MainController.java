package com.greenfox.springstart.Controllers;

import com.greenfox.springstart.Fox;
import com.greenfox.springstart.Services.FoxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

    @Autowired
    FoxService foxService;

    public FoxService getFoxService() {
        return foxService;
    }

    @GetMapping("/")
    public String checkFoxName(Model model, String name) {
        model.addAttribute( "fox",foxService.getFoxByName(name) );
        return "index";
    }

    @GetMapping("/login")
    public String loginFox(Model model) {
        return "login";
    }

    @PostMapping("/login")
    public String typeLoginOfFox(Model model, Fox fox){
        if (!foxService.contains( fox.getName() )) {
            foxService.saveFox(fox );
        }
        return "redirect:/?name=" + fox.getName();
    }

    @GetMapping(value = {"/nutritionStore/{name}"})
    public String showNutritionStore(@PathVariable("name") String name, Fox fox, Model model) {
        model.addAttribute("fox", fox.getName());
        return "nutritionStore?name=" + fox.getName();
    }

    @GetMapping("/trickCenter ")
    public String anotherstrst(Model model) {
        return "trickCenter ";
    }

    @GetMapping("/basicinfo")
    public String basicInfo(Model model, String name) {
        model.addAttribute( "fox", foxService.getFoxByName( name ) );
        return "information";
    }

    @GetMapping("/info")
    public String information () {
        return "basicinfo";
    }


}