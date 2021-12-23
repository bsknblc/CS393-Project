package com.Ozyegin.CS393.Service;

import com.Ozyegin.CS393.Model.AnswerComment;
import com.Ozyegin.CS393.Repository.AnswerCommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnswerCommentServiceImp implements AnswerCommentService {
    @Autowired
    AnswerCommentRepository answerCommentRepository;

    public AnswerComment save(AnswerComment answerComment) {
        return answerCommentRepository.save(answerComment);
    }
}
