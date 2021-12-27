package com.Ozyegin.CS393.DTO;

import com.Ozyegin.CS393.Model.AnswerComment;
import com.Ozyegin.CS393.Model.MyUser;
import com.Ozyegin.CS393.Model.Question;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

public class AnswerDTO {
    private int answerId;
    private Question question;
    private String answerText;
    private MyUser user;
    private int voteCount = 0;
    private List<AnswerComment> answerComments = new ArrayList<>();

    public AnswerDTO(){}

    public AnswerDTO(int answerId, Question question, String answerText, MyUser user, int voteCount, List<AnswerComment> answerComments) {
        this.answerId = answerId;
        this.question = question;
        this.answerText = answerText;
        this.user = user;
        this.voteCount = voteCount;
        this.answerComments = answerComments;
    }

    public int getAnswerId() {
        return answerId;
    }

    public void setAnswerId(int answerId) {
        this.answerId = answerId;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public String getAnswerText() {
        return answerText;
    }

    public void setAnswerText(String answerText) {
        this.answerText = answerText;
    }

    public MyUser getUser() {
        return user;
    }

    public void setUser(MyUser user) {
        this.user = user;
    }

    public int getVoteCount() {
        return voteCount;
    }

    public void setVoteCount(int voteCount) {
        this.voteCount = voteCount;
    }

    public List<AnswerComment> getAnswerComments() {
        return answerComments;
    }

    public void setAnswerComments(List<AnswerComment> answerComments) {
        this.answerComments = answerComments;
    }
}
