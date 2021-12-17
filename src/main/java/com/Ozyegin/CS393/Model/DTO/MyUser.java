package com.Ozyegin.CS393.Model.DTO;

import com.sun.istack.NotNull;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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