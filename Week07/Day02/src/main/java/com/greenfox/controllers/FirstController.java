package com.greenfox.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class FirstController {

    List<BankAccount> bankAccounts = new ArrayList<>(  );



    @GetMapping("/show")
    public String another(Model model) {
        model.addAttribute( "bankAccounts",bankAccounts );
        return "bankstats";
    }

    public FirstController () {
        BankAccount account01 = new BankAccount("Simba",2000.00,"lion");
        BankAccount account02 = new BankAccount( "Zebra", 2000.00,"zebra" );
        bankAccounts.add( account01 );
        bankAccounts.add( account02 );
    }
}
