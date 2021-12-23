package com.Ozyegin.CS393.DTO;

public class AnswerDTO {

    private int answerId;
    private String answerText;
    private int voteCount;

    public AnswerDTO(int answerId, String answerText, int voteCount) {
        this.answerId = answerId;
        this.answerText = answerText;
        this.voteCount = voteCount;
    }

    public AnswerDTO(int answerId) {
        this.answerId = answerId;
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
