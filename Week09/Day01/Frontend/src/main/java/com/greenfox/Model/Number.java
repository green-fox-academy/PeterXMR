package com.greenfox.Model;

import com.fasterxml.jackson.annotation.JsonInclude;

public class Number {

    Integer until;

    public Number() {
    }

    public Number (Integer until) {
        this.until = until;
    }

    public Integer getUntil() {
        return until;
    }

    public void setUntil(Integer until){
        this.until = until;
    }
}
