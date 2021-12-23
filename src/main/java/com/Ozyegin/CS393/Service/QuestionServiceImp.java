package com.Ozyegin.CS393.Service;

import com.Ozyegin.CS393.Model.Question;
import com.Ozyegin.CS393.Repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuestionServiceImp implements QuestionService{
    @Autowired
    QuestionRepository questionRepository;

    public Question save(Question question) {
        return questionRepository.save(question);
    }
}
