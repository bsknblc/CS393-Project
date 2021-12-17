package com.Ozyegin.CS393.Model.DTO;

import com.Ozyegin.CS393.Model.MyUser;
import com.Ozyegin.CS393.Model.Tag;
import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Question {
    private int questionId;

    private String questionTitle;

    private String questionDescription;

    private Date askedDate;

    private int answerCount;

    private int voteCount;

    public Question(){}

    public Question(String questionDescription, List<Tag> questionTag, MyUser askedBy, int answerCount, int voteCount) {
        if (questionDescription.length()>=100){
            this.questionTitle = questionDescription.substring(0,99);
        }else{
            this.questionTitle = questionDescription;
        }
        this.questionDescription = questionDescription;
        this.answerCount = answerCount;
        this.voteCount = voteCount;
    }

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public String getQuestionTitle() {
        return questionTitle;
    }

    public void setQuestionTitle(String questionTitle) {
        this.questionTitle = questionTitle;
    }

    public String getQuestionDescription() {
        return questionDescription;
    }

    public void setQuestionDescription(String questionDescription) {
        this.questionDescription = questionDescription;
    }

    public Date getAskedDate() {
        return askedDate;
    }

    public void setAskedDate(Date askedDate) {
        this.askedDate = askedDate;
    }

    public int getAnswerCount() {
        return answerCount;
    }

    public void setAnswerCount(int answerCount) {
        this.answerCount = answerCount;
    }

    public int getVoteCount() {
        return voteCount;
    }

    public void setVoteCount(int voteCount) {
        this.voteCount = voteCount;
    }
}
