package com.greenfoxacademy.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Todo {
    @Id
    @GeneratedValue
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

    public long getId() {
        return id;
    }

    public boolean getUrgent() {
        return urgent;
    }

    public boolean getDone() {
        return done;
    }

    public Todo() {
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setUrgent(boolean urgent) {
        this.urgent = urgent;
    }

    public void setDone(boolean done) {
        this.done = done;
    }
}
