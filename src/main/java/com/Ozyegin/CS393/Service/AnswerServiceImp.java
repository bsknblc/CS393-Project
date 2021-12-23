package com.Ozyegin.CS393.Service;

import com.Ozyegin.CS393.DTO.AnswerDTO;
import com.Ozyegin.CS393.Model.Answer;
import com.Ozyegin.CS393.Repository.AnswerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AnswerServiceImp implements AnswerService {
    @Autowired
    AnswerRepository answerRepository;

    public Answer save(Answer answer) {
        return answerRepository.save(answer);
    }

    public List<AnswerDTO> findAll(){
        List<Answer> answers = answerRepository.findAll();
        List<AnswerDTO> directorDTOs = new ArrayList<AnswerDTO>();
        for (Answer answer : answers) {
            directorDTOs.add(new AnswerDTO(answer.getAnswerId()));
        }
        return directorDTOs;
    }

    public AnswerDTO findById(int id){
        Answer answer = answerRepository.findById(id);
        AnswerDTO answerDTO = new AnswerDTO(answer.getAnswerId());
        return answerDTO;
    }

    public void deleteById(int id){ answerRepository.deleteById(id); }
}
