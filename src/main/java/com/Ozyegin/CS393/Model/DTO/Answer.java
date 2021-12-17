package com.Ozyegin.CS393.Model.DTO;

import com.Ozyegin.CS393.Model.MyUser;
import com.Ozyegin.CS393.Model.Question;
import com.sun.istack.NotNull;

import javax.persistence.Column;
import javax.persistence.ManyToOne;

public class Answer {

    private int answerId;

    private String answerText;

    private int voteCount;

    public Answer(){}

    public Answer(int answerId, String answerText, int voteCount) {
        this.answerId = answerId;
        this.answerText = answerText;
        this.voteCount = voteCount;
    }

    public int getAnswerId() {
        return answerId;
    }

    public void setAnswerId(int answerId) {
        this.answerId = answerId;
    }

    public String getAnswerText() {
        return answerText;
    }

    public void setAnswerText(String answerText) {
        this.answerText = answerText;
    }

    public int getVoteCount() {
        return voteCount;
    }

    public void setVoteCount(int voteCount) {
        this.voteCount = voteCount;
    }
}
