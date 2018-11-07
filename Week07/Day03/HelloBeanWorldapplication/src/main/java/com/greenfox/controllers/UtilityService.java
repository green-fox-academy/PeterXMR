package com.greenfox.controllers;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public class UtilityService  {
    ArrayList<String> colors;
    Random random;

    public UtilityService() {
        colors = new ArrayList<>();
        colors.add("red");
        colors.add("blue");
        colors.add("lime");
        colors.add("orange");
        colors.add("magenta");
        random = new Random();
    }

    public Boolean validateEmail (String email) {
        return (email.contains( "@" )&&email.contains( "."));
    }

    public String randomColor() {
        return colors.get(random.nextInt(colors.size()));
    }

    public String caesarEndocing(String text, int number) {
        String result = "";
        for(int i = 0; i < text.length(); i++) {
            result += (char)((int)text.charAt(i) + number);
        }
        return result;
    }

    public String caesarDeocing(String text, int number) {
        String result02 = "";
        for(int i = 0; i < text.length(); i++) {
            result02 += (char)((int)text.charAt(i) + number);
        }
        return result02;
    }

    private class Pattecrn {
    }
}