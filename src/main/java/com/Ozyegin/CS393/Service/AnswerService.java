package com.Ozyegin.CS393.Service;

import com.Ozyegin.CS393.DTO.AnswerDTO;
import com.Ozyegin.CS393.Model.Answer;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface AnswerService {
    public Answer save(Answer answer);
    public List<AnswerDTO> findAll();
    public AnswerDTO findById(int id);
    public void deleteById(int id);
    public AnswerDTO saveAnswer(Answer answer, int userId, int questionId);
}