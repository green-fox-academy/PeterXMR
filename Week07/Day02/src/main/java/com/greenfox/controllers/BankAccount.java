package com.greenfox.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;


public class BankAccount {

    public String name;
    public Double balance;
    public String animaltype;

    public BankAccount (String name,Double balance,String animaltype) {
        this.name = name;
        this.balance = balance;
        this.animaltype = animaltype;
    }
}
