package com.greenfox.controllers;


import org.springframework.web.bind.annotation.RequestParam;

public class Greeting {
    long id;
    String content;

    public long getId(){
        return id;
    }

    public String getContent () {
        return content;
    }

    public Greeting  (long id, String content) {
        this.id = id;
        this.content = content;
    }
}
