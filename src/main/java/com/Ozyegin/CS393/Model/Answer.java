package com.Ozyegin.CS393.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "T_ANSWER")
public class Answer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int answerId;

    @ManyToOne
    @NotNull
    @JsonIgnore
    private Question question;

    @NotNull
    @Column(name = "ANSWER_TEXT")
    private String answerText;

    @ManyToOne
    @NotNull
    private MyUser user;

    @NotNull
    @Column(name = "VOTE_COUNT")
    private int voteCount = 0;

    @OneToMany(mappedBy = "answer")
    @JsonIgnore
    private List<AnswerComment> answerComments = new ArrayList<>();

    public Answer(){}

    public Answer(Question question, String answerText, MyUser user) {
        this.question = question;
        this.answerText = answerText;
        this.user = user;
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