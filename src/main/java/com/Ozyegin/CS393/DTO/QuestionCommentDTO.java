package com.Ozyegin.CS393.DTO;

import com.Ozyegin.CS393.Model.MyUser;
import com.Ozyegin.CS393.Model.Question;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sun.istack.NotNull;

import javax.persistence.*;

public class QuestionCommentDTO {
    private int id;
    private Question question;
    private String commentText;
    private int voteCount = 0;


    public QuestionCommentDTO(){}

    public QuestionCommentDTO(int id, Question question, String commentText, int voteCount) {
        this.id = id;
        this.question = question;
        this.commentText = commentText;
        this.voteCount = voteCount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public String getCommentText() {
        return commentText;
    }

    public void setCommentText(String commentText) {
        this.commentText = commentText;
    }

    public int getVoteCount() {
        return voteCount;
    }

    public void setVoteCount(int voteCount) {
        this.voteCount = voteCount;
    }
}
