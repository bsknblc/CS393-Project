package com.Ozyegin.CS393.Model;

import javax.persistence.*;

@Entity
@Table(name = "T_ANSWERCOMMENT")
public class AnswerComment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int answerCommentId;


}
