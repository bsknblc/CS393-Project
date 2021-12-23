package com.Ozyegin.CS393.Model;

import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
@Table(name = "T_QUESTION_COMMENT")
public class QuestionComment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int commentId;

    public int getCommentId() {
        return commentId;
    }

    public void setCommentId(int commentId) {
        this.commentId = commentId;
    }

    @ManyToOne
    @NotNull
    private Question question;

    @NotNull
    @Column(name = "COMMENT_TEXT")
    private String commentText;

    @ManyToOne
    @NotNull
    private MyUser user;

    @NotNull
    @Column(name = "VOTE_COUNT")
    private int voteCount = 0;

}
