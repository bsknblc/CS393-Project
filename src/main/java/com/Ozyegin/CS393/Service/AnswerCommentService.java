package com.Ozyegin.CS393.Service;

import com.Ozyegin.CS393.DTO.AnswerCommentDTO;
import com.Ozyegin.CS393.Model.AnswerComment;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface AnswerCommentService {
    public AnswerComment save(AnswerComment answerComment);
    public List<AnswerCommentDTO> findAll();
    public AnswerCommentDTO findById(int id);
    public void deleteById(int id);
    public AnswerCommentDTO saveAnswerComment(AnswerComment answerComment, int userId, int answerId);
}
