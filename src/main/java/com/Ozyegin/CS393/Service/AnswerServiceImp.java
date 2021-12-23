package com.Ozyegin.CS393.Service;

import com.Ozyegin.CS393.Model.Answer;
import com.Ozyegin.CS393.Repository.AnswerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnswerServiceImp implements AnswerService {
    @Autowired
    AnswerRepository answerRepository;

    public Answer save(Answer answer) {
        return answerRepository.save(answer);
    }
}
