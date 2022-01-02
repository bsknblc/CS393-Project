package com.Ozyegin.CS393.Service;

import com.Ozyegin.CS393.DTO.AnswerCommentDTO;
import com.Ozyegin.CS393.DTO.QuestionCommentDTO;
import com.Ozyegin.CS393.Model.Answer;
import com.Ozyegin.CS393.Model.AnswerComment;
import com.Ozyegin.CS393.Model.MyUser;
import com.Ozyegin.CS393.Model.Question;
import com.Ozyegin.CS393.Repository.AnswerCommentRepository;
import com.Ozyegin.CS393.Repository.AnswerRepository;
import com.Ozyegin.CS393.Repository.MyUserRepository;
import com.Ozyegin.CS393.Repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AnswerCommentServiceImp implements AnswerCommentService {
    @Autowired
    AnswerCommentRepository answerCommentRepository;

    @Autowired
    MyUserRepository myUserRepository;

    @Autowired
    AnswerRepository answerRepository;

    public AnswerComment save(AnswerComment answerComment) {
        return answerCommentRepository.save(answerComment);
    }

    public List<AnswerCommentDTO> findAll() {
        List<AnswerComment> answerComments = answerCommentRepository.findAll();
        List<AnswerCommentDTO> answerCommentDTOS = new ArrayList<AnswerCommentDTO>();
        for (AnswerComment answerComment: answerComments) {
            answerCommentDTOS.add(new AnswerCommentDTO(answerComment.getAnswerCommentId(), answerComment.getAnswer(), answerComment.getCommentText(), answerComment.getVoteCount()));
        }
        return answerCommentDTOS;
    }

    public AnswerCommentDTO findById(int id){
        AnswerComment answerComment = answerCommentRepository.findById(id);
        AnswerCommentDTO answerCommentDTO = new AnswerCommentDTO(answerComment.getAnswerCommentId(), answerComment.getAnswer(), answerComment.getCommentText(), answerComment.getVoteCount());
        return  answerCommentDTO;
    }

    public void deleteById(int id){ answerCommentRepository.deleteById(id); }

    public AnswerCommentDTO saveAnswerComment(AnswerComment answerComment, int userId, int answerId){

        Answer answer = answerRepository.findById(answerId);
        answerComment.setAnswer(answer);

        answerCommentRepository.save(answerComment);
        AnswerCommentDTO answerCommentDTO = new AnswerCommentDTO(answerComment.getAnswerCommentId(), answerComment.getAnswer(), answerComment.getCommentText(), answerComment.getVoteCount());


        answer.getAnswerComments().add(answerComment);
        answerRepository.save(answer);

        return answerCommentDTO;
    }

}
