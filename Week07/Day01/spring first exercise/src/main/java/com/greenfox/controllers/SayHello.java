package com.greenfox.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.swing.*;
import java.util.Random;

@Controller
public class SayHello {

    String[] hellos = {"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den", "Ahoj", "Goddag", "Goede dag, Hallo", "Hello", "Saluton", "Hei", "Bonjour",
            "Guten Tag", "Gia'sou", "Aloha", "Shalom", "Namaste", "Namaste", "Jó napot", "Halló", "Helló", "Góðan daginn", "Halo", "Aksunai", "Qanuipit", "Dia dhuit",
            "Salve", "Ciao", "Kon-nichiwa", "An-nyong Ha-se-yo", "Salvëte", "Ni hao", "Dzien' dobry", "Olá", "Bunã ziua", "Zdravstvuyte", "Hola", "Jambo", "Hujambo", "Hej",
            "Sa-wat-dee", "Merhaba", "Selam", "Vitayu", "Xin chào", "Hylo", "Sut Mae", "Sholem Aleychem", "Sawubona"};

    String[] colours = {"blue", "red", "green", "white", "black", "yellow", "orange", "brown"};
    String[] fontSize = {"15px", "24px", "36px", "48px", "56px", "62px", "76px", "90px"};
    Random random = new Random();

    @RequestMapping("/web/hello")
    public String sayHello(Model model) {
        model.addAttribute( "hellos", hellos[random.nextInt( hellos.length )] );
        model.addAttribute( "colours", colours[random.nextInt( colours.length )] );
        model.addAttribute( "fontSize", fontSize[random.nextInt( fontSize.length )] );
        return "hello";
    }
}