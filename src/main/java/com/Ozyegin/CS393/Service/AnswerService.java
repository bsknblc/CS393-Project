package com.Ozyegin.CS393.Service;

import com.Ozyegin.CS393.DTO.AnswerDTO;
import com.Ozyegin.CS393.Model.Answer;

import java.util.List;

public interface AnswerService {
    public Answer save(Answer answer);
    public List<AnswerDTO> findAll();
    public AnswerDTO findById(int id);
    public void deleteById(int id);
}