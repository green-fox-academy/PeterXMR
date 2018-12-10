package com.greenfox.todo.Model;

public class AppUser {

    String username;
    String password;
//    String token;

    public AppUser(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public AppUser() {
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
