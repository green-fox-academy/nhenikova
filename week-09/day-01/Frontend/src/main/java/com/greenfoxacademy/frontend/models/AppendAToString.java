package com.greenfoxacademy.frontend.models;

public class AppendAToString {
    private String appended;

    public AppendAToString(String appended) {
        this.appended = appended + "a";
    }

    public String getAppended() {
        return appended;
    }

    public void setAppended(String appended) {
        this.appended = appended;
    }
}
