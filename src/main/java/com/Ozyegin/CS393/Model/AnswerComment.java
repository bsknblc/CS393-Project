package com.Ozyegin.CS393.Model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sun.istack.NotNull;
import javax.persistence.*;

@Entity
@Table(name = "T_ANSWERCOMMENT")
public class AnswerComment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @NotNull
    @Column(name = "COMMENT_TEXT", length = 50)
    private String commentText;

    @ManyToOne
    @NotNull
    @JsonIgnore
    private MyUser user;

    @NotNull
    @Column(name = "VOTE_COUNT")
    private int voteCount = 0;

    @ManyToOne
    @NotNull
    @JsonIgnore
    private Answer answer;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCommentText() {
        return commentText;
    }

    public void setCommentText(String commentText) {
        this.commentText = commentText;
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

    public Answer getAnswer() {
        return answer;
    }

    public void setAnswer(Answer answer) {
        this.answer = answer;
    }
}
