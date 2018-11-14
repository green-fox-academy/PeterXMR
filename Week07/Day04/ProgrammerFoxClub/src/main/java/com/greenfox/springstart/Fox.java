package com.greenfox.springstart;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

public class Fox {

    public String name;
    String food;
    String drink;
    List<String> tricks = new ArrayList<>(  );

    public void Fox (String name, String food, String drink, List tricks){
        this.drink = drink;
        this.name = name;
        this.food = food;
        this.tricks = tricks;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public void setTricks(List<String> tricks) {
        this.tricks = tricks;
    }

    public String getName() {
        return name;
    }

    public String getFood() {
        return food;
    }

    public String getDrink() {
        return drink;
    }

    public List<String> getTricks() {
        return tricks;
    }
}
