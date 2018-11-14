package com.greeenfoxacademy.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Todo {
    @GeneratedValue
    @Id
    long id;
    String title;
    boolean urgent = false;
    boolean done = false;


    //id: long, title: String, urgent: boolean(default false), done: boolean(default false)
    public Todo( String title) {
        this.title = title;
    }

    public String getTitle () {
        return title;
    }

    public Todo() {
    }
}
