package com.Ozyegin.CS393.Model.DTO;

import com.sun.istack.NotNull;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Tag {
    private int tagId;

    private String tagName;

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
}