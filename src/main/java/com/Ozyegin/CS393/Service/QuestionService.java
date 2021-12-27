package com.Ozyegin.CS393.Service;

import com.Ozyegin.CS393.DTO.QuestionDTO;
import com.Ozyegin.CS393.Model.Question;

import java.util.List;

public interface QuestionService {
    public Question save(Question question);
    public List<QuestionDTO> findAll();
    public QuestionDTO findById(int id);
    public void deleteById(int id);
}
