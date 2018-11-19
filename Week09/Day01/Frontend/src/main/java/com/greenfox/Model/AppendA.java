package com.greenfox.Model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class AppendA {

    @JsonProperty("appended")
    String appendable;

    public AppendA (String appendable) {
        this.appendable = appendable + "a";
    }

    public void setAppendable(String appendable) {
        this.appendable = appendable;
    }

    public String getAppendable() {
        return appendable;
    }
}
