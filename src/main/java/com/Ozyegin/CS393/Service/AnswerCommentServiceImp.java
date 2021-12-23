package com.Ozyegin.CS393.Service;

import com.Ozyegin.CS393.DTO.AnswerCommentDTO;
import com.Ozyegin.CS393.Model.AnswerComment;
import com.Ozyegin.CS393.Repository.AnswerCommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AnswerCommentServiceImp implements AnswerCommentService {
    @Autowired
    AnswerCommentRepository answerCommentRepository;

    public AnswerComment save(AnswerComment answerComment) {
        return answerCommentRepository.save(answerComment);
    }

    public List<AnswerCommentDTO> findAll() {
        List<AnswerComment> answerComments = answerCommentRepository.findAll();
        List<AnswerCommentDTO> answerCommentDTOS = new ArrayList<AnswerCommentDTO>();
        for (AnswerComment answerComment: answerComments) {
            answerCommentDTOS.add(new AnswerCommentDTO(answerComment.getId()));
        }
        return answerCommentDTOS;
    }

    public AnswerCommentDTO findById(int id){
        AnswerComment answerComment = answerCommentRepository.findById(id);
        AnswerCommentDTO answerCommentDTO = new AnswerCommentDTO(answerComment.getId());
        return  answerCommentDTO;
    }

    public void deleteById(int id){ answerCommentRepository.deleteById(id); }
}
