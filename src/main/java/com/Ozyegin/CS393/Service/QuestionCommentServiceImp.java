package com.Ozyegin.CS393.Service;

import com.Ozyegin.CS393.Model.QuestionComment;
import com.Ozyegin.CS393.Repository.QuestionCommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuestionCommentServiceImp implements QuestionCommentService {
    @Autowired
    QuestionCommentRepository questionCommentRepository;

    public QuestionComment save(QuestionComment questionComment) {
        return questionCommentRepository.save(questionComment);
    }
}
