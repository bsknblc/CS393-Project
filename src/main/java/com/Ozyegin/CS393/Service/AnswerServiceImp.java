package com.Ozyegin.CS393.Service;

import com.Ozyegin.CS393.DTO.AnswerDTO;
import com.Ozyegin.CS393.Model.Answer;
import com.Ozyegin.CS393.Model.MyUser;
import com.Ozyegin.CS393.Model.Question;
import com.Ozyegin.CS393.Repository.AnswerRepository;
import com.Ozyegin.CS393.Repository.MyUserRepository;
import com.Ozyegin.CS393.Repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AnswerServiceImp implements AnswerService {
    @Autowired
    AnswerRepository answerRepository;

    @Autowired
    MyUserRepository myUserRepository;

    @Autowired
    QuestionRepository questionRepository;

    public Answer save(Answer answer) {
        return answerRepository.save(answer);
    }

    public List<AnswerDTO> findAll(){
        List<Answer> answers = answerRepository.findAll();
        List<AnswerDTO> directorDTOs = new ArrayList<AnswerDTO>();
        for (Answer answer : answers) {
            directorDTOs.add(new AnswerDTO(answer.getAnswerId(), answer.getQuestion(), answer.getAnswerText(), answer.getUser(), answer.getVoteCount(), answer.getAnswerComments()));
        }
        return directorDTOs;
    }

    public AnswerDTO findById(int id){
        Answer answer = answerRepository.findById(id);
        AnswerDTO answerDTO = new AnswerDTO(answer.getAnswerId(), answer.getQuestion(), answer.getAnswerText(), answer.getUser(), answer.getVoteCount(), answer.getAnswerComments());
        return answerDTO;
    }

    public void deleteById(int id){ answerRepository.deleteById(id); }

    public AnswerDTO saveAnswer(Answer answer, int userId, int questionId){
        MyUser user = myUserRepository.findById(userId);
        answer.setUser(user);

        Question question = questionRepository.findById(questionId);
        answer.setQuestion(question);

        answerRepository.save(answer);
        AnswerDTO answerDTO = new AnswerDTO(answer.getAnswerId(), answer.getQuestion(), answer.getAnswerText(), answer.getUser(), answer.getVoteCount(), answer.getAnswerComments());

        user.getAnswers().add(answer);
        myUserRepository.save(user);

        question.getAnswers().add(answer);
        questionRepository.save(question);

        return answerDTO;
    }

}
