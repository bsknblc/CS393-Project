package com.Ozyegin.CS393.DTO;

public class MyUserDTO {
    private int userId;
    private String name;

    public MyUserDTO(int userId, String name){
        this.name = name;
        this.userId = userId;
    }

    public MyUserDTO(int userId){
        this.userId = userId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId() { this.userId = userId; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }
}