package com.greenfoxacademy.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Todo {
    @Id
    @GeneratedValue
    long id;

    String title;
    boolean urgent = false;
    boolean done = false;

    @ElementCollection
    private List<String> keywords;

    @Temporal(TemporalType.TIMESTAMP)
    private Date postedOn;

    //id: long, title: String, urgent: boolean(default false), done: boolean(default false)
    public Todo(String title) {
        this.title = title;
    }

    public Todo() {
    }

//    public String searchByTitle(String title,String searchedTitle){
//        String description[] = title.split( " " );
//        if (description.toString().contains(  ) searchedTitle.re);
//        return ;
//    }

    public String getTitle() {
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
