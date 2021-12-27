package com.Ozyegin.CS393.DTO;

import com.Ozyegin.CS393.Model.Answer;
import com.Ozyegin.CS393.Model.MyUser;
import com.Ozyegin.CS393.Model.QuestionComment;
import com.Ozyegin.CS393.Model.Tag;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class QuestionDTO {
    private int questionId;
    private String questionTitle;
    private String questionDescription;
    private List<Tag> questionTag = new ArrayList<>();
    private Date askedDate = new Date();
    private MyUser askedBy;
    private int answerCount;
    private int voteCount = 0;
    private List<Answer> answers = new ArrayList<>();
    private List<QuestionComment> questionComments = new ArrayList<>();

    public QuestionDTO(){}

    public QuestionDTO(int questionId, String questionTitle, String questionDescription, List<Tag> questionTag, Date askedDate, MyUser askedBy, int answerCount, int voteCount, List<Answer> answers, List<QuestionComment> questionComments) {
        this.questionId = questionId;
        this.questionTitle = questionTitle;
        this.questionDescription = questionDescription;
        this.questionTag = questionTag;
        this.askedDate = askedDate;
        this.askedBy = askedBy;
        this.answerCount = answerCount;
        this.voteCount = voteCount;
        this.answers = answers;
        this.questionComments = questionComments;
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

    public List<Tag> getQuestionTag() {
        return questionTag;
    }

    public void setQuestionTag(List<Tag> questionTag) {
        this.questionTag = questionTag;
    }

    public Date getAskedDate() {
        return askedDate;
    }

    public void setAskedDate(Date askedDate) {
        this.askedDate = askedDate;
    }

    public MyUser getAskedBy() {
        return askedBy;
    }

    public void setAskedBy(MyUser askedBy) {
        this.askedBy = askedBy;
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

    public List<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }

    public List<QuestionComment> getQuestionComments() {
        return questionComments;
    }

    public void setQuestionComments(List<QuestionComment> questionComments) {
        this.questionComments = questionComments;
    }
}
