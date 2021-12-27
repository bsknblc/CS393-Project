package com.Ozyegin.CS393.Service;

import com.Ozyegin.CS393.DTO.QuestionCommentDTO;
import com.Ozyegin.CS393.Model.QuestionComment;
import com.Ozyegin.CS393.Repository.QuestionCommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class QuestionCommentServiceImp implements QuestionCommentService {
    @Autowired
    QuestionCommentRepository questionCommentRepository;

    public QuestionComment save(QuestionComment questionComment) {
        return questionCommentRepository.save(questionComment);
    }

    public List<QuestionCommentDTO> findAll(){
        List<QuestionComment> questionComments = questionCommentRepository.findAll();
        List<QuestionCommentDTO> questionCommentDTOs = new ArrayList<QuestionCommentDTO>();
        for (QuestionComment questionComment: questionComments) {
            questionCommentDTOs.add(new QuestionCommentDTO(questionComment.getId(), questionComment.getUser(), questionComment.getQuestion(), questionComment.getCommentText(), questionComment.getVoteCount()));
        }
        return questionCommentDTOs;
    }

    public QuestionCommentDTO findById(int id){
        QuestionComment questionComment = questionCommentRepository.findById(id);
        QuestionCommentDTO questionCommentDTO = new QuestionCommentDTO(questionComment.getId(), questionComment.getUser(), questionComment.getQuestion(), questionComment.getCommentText(), questionComment.getVoteCount());
        return questionCommentDTO;
    }

    public void deleteById(int id){ questionCommentRepository.deleteById(id); }
}
