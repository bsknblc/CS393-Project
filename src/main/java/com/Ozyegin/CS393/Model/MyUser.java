package com.Ozyegin.CS393.Model;

import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
@Table(name = "T_MYUSER")
public class MyUser {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int userId;

    @NotNull
    @Column(name = "NAME", length = 50)
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
