package com.Ozyegin.CS393.Service;

import com.Ozyegin.CS393.DTO.QuestionDTO;
import com.Ozyegin.CS393.Model.Question;
import com.Ozyegin.CS393.Model.QuestionComment;
import com.Ozyegin.CS393.Repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class QuestionServiceImp implements QuestionService{
    @Autowired
    QuestionRepository questionRepository;

    public Question save(Question question) {
        return questionRepository.save(question);
    }

    public List<QuestionDTO> findAll(){
        List<Question> questions = questionRepository.findAll();
        List<QuestionDTO> questionDTOS = new ArrayList<QuestionDTO>();
        for (Question question: questions) {
            questionDTOS.add(new QuestionDTO(question.getQuestionId()));
        }
        return questionDTOS;
    }

    public QuestionDTO findById(int id){
        Question question = questionRepository.findById(id);
        QuestionDTO questionDTO = new QuestionDTO(question.getQuestionId());
        return questionDTO;
    }

    public void deleteById(int id){ questionRepository.deleteById(id); }
}
