package com.greenfox.Model;

import com.fasterxml.jackson.annotation.JsonInclude;

public class AppendA {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    String appendable;

    public String getAppendable (String appended) {
        appended = appendable + "a";
        return appendable;
    }

    public void setAppendable(String appendable) {
        this.appendable = appendable;
    }
}
