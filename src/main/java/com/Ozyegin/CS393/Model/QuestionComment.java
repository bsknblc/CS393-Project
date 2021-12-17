package com.Ozyegin.CS393.Model;

import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
@Table(name = "T_QUESTION_COMMENT")
public class QuestionComment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int commentId;

    @ManyToOne
    @NotNull
    @Column(name = "ANSWER")
    private Answer answer;

    @NotNull
    @Column(name = "COMMENT_TEXT")
    private String commentText;

    @ManyToOne
    @NotNull
    @Column(name = "USER")
    private MyUser user;

    @NotNull
    @Column(name = "VOTE_COUNT")
    private int voteCount = 0;

}
