package com.greenfox.todo.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Message {

    @GeneratedValue
    @Id
    long id;
    String title;

    public Message(String title) {
        this.title = title;
    }

    public Message() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
