package com.Ozyegin.CS393.Model;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "T_QUESTION")
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int questionId;

    @NotNull
    @Column(name = "QUESTION_TITLE", length = 50)
    private String questionTitle;

    @NotNull
    @Column(name = "QUESTION_DESCRIPTION", length = 50)
    private String questionDescription;

    @NotNull
    @ManyToMany
    @Column(name = "QUESTION_TAG")
    private List<Tag> questionTag = new ArrayList<>();

    @NotNull
    @Column(name = "ASKED_DATE")
    private Date askedDate = new Date();

    @NotNull
    @ManyToOne
    @Column(name = "ASKED_BY")
    private MyUser askedBy;

    @NotNull
    @Column(name = "ANSWER_COUNT")
    private int answerCount;

    @NotNull
    @Column(name = "VOTE_COUNT")
    private int voteCount;

    public Question(){}

    public Question(String questionDescription, List<Tag> questionTag, MyUser askedBy, int answerCount, int voteCount) {
        if (questionDescription.length()>=100){
            this.questionTitle = questionDescription.substring(0,99);
        }else{
            this.questionTitle = questionDescription;
        }
        this.questionDescription = questionDescription;
        this.questionTag = questionTag;
        this.askedBy = askedBy;
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
}
