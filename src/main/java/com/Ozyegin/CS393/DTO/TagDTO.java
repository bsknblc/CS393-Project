package com.Ozyegin.CS393.DTO;

import com.Ozyegin.CS393.Model.Question;

import java.util.ArrayList;
import java.util.List;

public class TagDTO {
    private int tagId;
    private String tagName;
    private List<Question> questions = new ArrayList<>();

    public TagDTO(int tagId, String tagName, List<Question> questions) {
        this.tagId = tagId;
        this.tagName = tagName;
        this.questions = questions;
    }

    public int getTagId() {
        return tagId;
    }

    public void setTagId(int tagId) {
        this.tagId = tagId;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }
}