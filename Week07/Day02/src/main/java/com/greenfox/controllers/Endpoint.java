package com.greenfox.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class Endpoint {

    List<BankAccount> bankAccounts = new ArrayList<>(  );


    @GetMapping("/account/show")
    public String another(Model model) {

    model.addAttribute( "bankAccounts",bankAccounts );
    return "bankstats02";
    }
    //<td th:switch="Bad Guy" data-th-switch="Good Guy"></td>

    public Endpoint () {
    BankAccount account01 = new BankAccount("Leo",1000.00,"mouse");
    BankAccount account02 = new BankAccount("Nemo", 3000.00,"fish");
    BankAccount account03 = new BankAccount("King",4000.00,"dog");
    BankAccount account04 = new BankAccount("Izabela",2500.00,"duck");

    bankAccounts.add( account01 );
    bankAccounts.add( account04 );
    bankAccounts.add( account02 );
    bankAccounts.add( account03 );
    }
}