package com.Ozyegin.CS393.Service;

import com.Ozyegin.CS393.DTO.QuestionDTO;
import com.Ozyegin.CS393.Model.MyUser;
import com.Ozyegin.CS393.Model.Question;
import com.Ozyegin.CS393.Model.QuestionComment;
import com.Ozyegin.CS393.Model.Tag;
import com.Ozyegin.CS393.Repository.MyUserRepository;
import com.Ozyegin.CS393.Repository.QuestionRepository;
import com.Ozyegin.CS393.Repository.TagRepository;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@Service
public class QuestionServiceImp implements QuestionService{
    @Autowired
    QuestionRepository questionRepository;

    @Autowired
    MyUserRepository myUserRepository;

    @Autowired
    TagRepository tagRepository;

    public Question save(Question question) {
        return questionRepository.save(question);
    }

    public List<QuestionDTO> findAll(){
        List<Question> questions = questionRepository.findAll();
        List<QuestionDTO> questionDTOS = new ArrayList<QuestionDTO>();
        for (Question question: questions) {
            questionDTOS.add(new QuestionDTO(question.getQuestionId(),question.getQuestionTitle(), question.getQuestionDescription(), question.getQuestionTag(), question.getAskedDate(), question.getAskedBy(), question.getAnswerCount(), question.getVoteCount(), question.getAnswers(), question.getQuestionComments()));
        }
        return questionDTOS;
    }

    public QuestionDTO findById(int id){
        Question question = questionRepository.findById(id);
        QuestionDTO questionDTO = new QuestionDTO(question.getQuestionId(),question.getQuestionTitle(), question.getQuestionDescription(), question.getQuestionTag(), question.getAskedDate(), question.getAskedBy(), question.getAnswerCount(), question.getVoteCount(), question.getAnswers(), question.getQuestionComments());
        return questionDTO;
    }

    public void deleteById(int id){ questionRepository.deleteById(id); }

    public QuestionDTO saveQuestion(Question question, int userId, int tagId){
        MyUser user = myUserRepository.findById(userId);
        question.setAskedBy(user);

        Tag tag = tagRepository.findById(tagId);
        question.getQuestionTag().add(tag);

        questionRepository.save(question);
        QuestionDTO questionDTO = new QuestionDTO(question.getQuestionId(),question.getQuestionTitle(), question.getQuestionDescription(), question.getQuestionTag(), question.getAskedDate(), question.getAskedBy(), question.getAnswerCount(), question.getVoteCount(), question.getAnswers(), question.getQuestionComments());

        user.getQuestions().add(question);
        myUserRepository.save(user);

        tag.getQuestions().add(question);
        tagRepository.save(tag);


        return questionDTO;

    }
}
