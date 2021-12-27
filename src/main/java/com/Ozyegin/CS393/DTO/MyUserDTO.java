package com.Ozyegin.CS393.DTO;

import com.Ozyegin.CS393.Model.Answer;
import com.Ozyegin.CS393.Model.Question;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

public class MyUserDTO {
    private int userId;
    private String name;
    private List<Question> questions = new ArrayList<>();
    private List<Answer> answers = new ArrayList<>();

    public MyUserDTO(){}

    public MyUserDTO(int userId, String name, List<Question> questions, List<Answer> answers) {
        this.userId = userId;
        this.name = name;
        this.questions = questions;
        this.answers = answers;
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

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }
}