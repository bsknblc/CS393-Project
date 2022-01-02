package com.Ozyegin.CS393.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "T_ANSWERCOMMENT")
public class AnswerComment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int answerCommentId;

    @ManyToOne
    @JsonIgnore
    private MyUser user;

    @ManyToOne
    @JsonIgnore
    private Answer answer;

    @NotNull
    @Column(name = "COMMENT_TEXT")
    private String commentText;

    @NotNull
    @Column(name = "VOTE_COUNT")
    private int voteCount = 0;

    public MyUser getUser() {
        return user;
    }

    public void setUser(MyUser user) {
        this.user = user;
    }

    public AnswerComment(){}

    public int getId() {
        return answerCommentId;
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

    public void setId(int id) {
        this.answerCommentId = answerCommentId;
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
