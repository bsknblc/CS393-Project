package com.Ozyegin.CS393.Model;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "T_TAG")
public class Tag {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int tagId;

    @NotNull
    @Column(name = "TAG_NAME", length = 50)
    private String tagName;

    @NotNull
    @ManyToMany(mappedBy = "questionTag")
    private List<Question> questions = new ArrayList<>();

    public Tag(){}

    public Tag(String tagName){
        this.tagName = tagName;
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