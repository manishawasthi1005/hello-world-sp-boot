package com.manish.helloworldsb.model;

public class User {
    private String id;
    private String userFirstName;
    private String userLastName;
    private String emailId;

    public User() {
    }

    public User(String id, String userFirstName, String userLastName, String emailId) {
        this.id = id;
        this.userFirstName = userFirstName;
        this.userLastName = userLastName;
        this.emailId = emailId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserFirstName() {
        return userFirstName;
    }

    public void setUserFirstName(String userFirstName) {
        this.userFirstName = userFirstName;
    }

    public String getUserLastName() {
        return userLastName;
    }

    public void setUserLastName(String userLastName) {
        this.userLastName = userLastName;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
}