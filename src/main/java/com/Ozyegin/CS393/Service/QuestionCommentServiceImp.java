package com.Ozyegin.CS393.Service;

import com.Ozyegin.CS393.DTO.QuestionCommentDTO;
import com.Ozyegin.CS393.DTO.QuestionDTO;
import com.Ozyegin.CS393.Model.MyUser;
import com.Ozyegin.CS393.Model.Question;
import com.Ozyegin.CS393.Model.QuestionComment;
import com.Ozyegin.CS393.Model.Tag;
import com.Ozyegin.CS393.Repository.MyUserRepository;
import com.Ozyegin.CS393.Repository.QuestionCommentRepository;
import com.Ozyegin.CS393.Repository.QuestionRepository;
import com.Ozyegin.CS393.Repository.TagRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class QuestionCommentServiceImp implements QuestionCommentService {
    @Autowired
    QuestionCommentRepository questionCommentRepository;

    @Autowired
    MyUserRepository myUserRepository;

    @Autowired
    QuestionRepository questionRepository;

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

    public QuestionCommentDTO saveQuestionComment(QuestionComment questionComment, int userId, int questionId){
        MyUser user = myUserRepository.findById(userId);
        questionComment.setUser(user);

        Question question = questionRepository.findById(questionId);
        questionComment.setQuestion(question);

        questionCommentRepository.save(questionComment);
        QuestionCommentDTO questionCommentDTO = new QuestionCommentDTO(questionComment.getId(), questionComment.getUser(), questionComment.getQuestion(), questionComment.getCommentText(), questionComment.getVoteCount());

        user.getQuestionComments().add(questionComment);
        myUserRepository.save(user);

        question.getQuestionComments().add(questionComment);
        questionRepository.save(question);

        return questionCommentDTO;
    }

}
