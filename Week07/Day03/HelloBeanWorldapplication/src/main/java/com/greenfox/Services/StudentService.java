package com.greenfox.Services;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    ArrayList<String> names;
    int counter =3;

    public int getCounter() {
        return counter;
    }

    public StudentService() {
        names = new ArrayList<>();
        names.add("Sanyi");
        names.add("Lilla");
        names.add("John");
    }

    public List<String> findAll() {
        return names;
    }

    public void save(String student) {
        names.add(student);
        count();
    }

    public void count() {
            counter ++;
        }

    public Boolean checkname (String name) {
        return (names.contains( name ));
    }
    }