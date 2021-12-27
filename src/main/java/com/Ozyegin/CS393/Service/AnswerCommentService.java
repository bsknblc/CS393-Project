package com.Ozyegin.CS393.Service;

import com.Ozyegin.CS393.DTO.AnswerCommentDTO;
import com.Ozyegin.CS393.Model.AnswerComment;

import java.util.List;

public interface AnswerCommentService {
    public AnswerComment save(AnswerComment answerComment);
    public List<AnswerCommentDTO> findAll();
    public AnswerCommentDTO findById(int id);
    public void deleteById(int id);
}
