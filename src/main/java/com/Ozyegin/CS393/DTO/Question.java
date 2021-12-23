package com.Ozyegin.CS393.DTO;

import java.util.Date;

public class Question {
    private int questionId;

    private String questionTitle;

    private String questionDescription;

    private Date askedDate;

    private int answerCount;

    private int voteCount;

    public Question(){}

    public Question(int questionId, String questionTitle, String questionDescription, Date askedDate, int answerCount, int voteCount) {
        this.questionId = questionId;
        this.questionTitle = questionTitle;
        this.questionDescription = questionDescription;
        this.askedDate = askedDate;
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
