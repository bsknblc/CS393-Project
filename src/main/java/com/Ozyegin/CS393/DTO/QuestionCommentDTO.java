package com.Ozyegin.CS393.DTO;

import com.Ozyegin.CS393.Model.Question;

public class QuestionCommentDTO {
    private int id;

    public QuestionCommentDTO(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
