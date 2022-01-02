package com.Ozyegin.CS393.DTO;

import com.Ozyegin.CS393.Model.Answer;
import com.Ozyegin.CS393.Model.MyUser;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sun.istack.NotNull;

import javax.persistence.*;

public class AnswerCommentDTO {
    private int answerCommentId;
    private Answer answer;
    private String commentText;
    private int voteCount = 0;

    public AnswerCommentDTO(){}

    public AnswerCommentDTO(int answerCommentId, Answer answer, String commentText, int voteCount) {
        this.answerCommentId = answerCommentId;
        this.answer = answer;
        this.commentText = commentText;
        this.voteCount = voteCount;
    }

    public int getAnswerCommentId() {
        return answerCommentId;
    }

    public void setAnswerCommentId(int answerCommentId) {
        this.answerCommentId = answerCommentId;
    }

    public Answer getAnswer() {
        return answer;
    }

    public void setAnswer(Answer answer) {
        this.answer = answer;
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
