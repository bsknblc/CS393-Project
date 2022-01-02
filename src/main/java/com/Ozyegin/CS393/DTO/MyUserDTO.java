package com.Ozyegin.CS393.DTO;

import com.Ozyegin.CS393.Model.Answer;
import com.Ozyegin.CS393.Model.AnswerComment;
import com.Ozyegin.CS393.Model.Question;
import com.Ozyegin.CS393.Model.QuestionComment;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

public class MyUserDTO {
    private int userId;
    private String name;
    private List<Question> questions = new ArrayList<>();
    private List<Answer> answers = new ArrayList<>();
    private List<QuestionComment> questionComments = new ArrayList<>();
    private List<AnswerComment> answerComments = new ArrayList<>();

    public MyUserDTO(){}

    public MyUserDTO(int userId, String name, List<Question> questions, List<Answer> answers, List<QuestionComment> questionComments, List<AnswerComment> answerComments) {
        this.userId = userId;
        this.name = name;
        this.questions = questions;
        this.answers = answers;
        this.questionComments = questionComments;
        this.answerComments = answerComments;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
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

    public List<AnswerComment> getAnswerComments() {
        return answerComments;
    }

    public void setAnswerComments(List<AnswerComment> answerComments) {
        this.answerComments = answerComments;
    }

}