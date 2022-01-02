package com.Ozyegin.CS393.Service;

import com.Ozyegin.CS393.DTO.QuestionCommentDTO;
import com.Ozyegin.CS393.Model.QuestionComment;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface QuestionCommentService {
    public QuestionComment save(QuestionComment questionComment);
    public List<QuestionCommentDTO> findAll();
    public QuestionCommentDTO findById(int id);
    public void deleteById(int id);
    public QuestionCommentDTO saveQuestionComment(QuestionComment questionComment, int userId, int questionId);
    public QuestionCommentDTO updateQuestionComment(String text, int questionCommentId);
}
