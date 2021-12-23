package com.Ozyegin.CS393.DTO;

public class MyUser {
    private int userId;

    private String name;

    public MyUser(){}

    public MyUser(String name){
        this.name = name;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}