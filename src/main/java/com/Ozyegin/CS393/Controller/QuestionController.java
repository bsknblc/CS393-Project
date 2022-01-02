package com.Ozyegin.CS393.Controller;

import com.Ozyegin.CS393.DTO.QuestionDTO;
import com.Ozyegin.CS393.Model.Question;
import com.Ozyegin.CS393.Model.QuestionComment;
import com.Ozyegin.CS393.Repository.QuestionRepository;
import com.Ozyegin.CS393.Service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/questions")
public class QuestionController {
    @Autowired
    QuestionService questionService;
    QuestionRepository questionRepository;

    @GetMapping
    public List<QuestionDTO> findAll(){ return questionService.findAll(); }

    @GetMapping("/{question-id}")
    public QuestionDTO getQuestionById(@PathVariable("question-id") int id) {return questionService.findById(id); }

    @DeleteMapping("/{question-id}")
    public void deleteById(@PathVariable("question-id") int id){ questionService.deleteById(id); }

    @PostMapping
    public Question save(@RequestBody Question question){
        return questionService.save(question);
    }

    @PostMapping("/user/{user-id}/tag/{tag-id}")
    public QuestionDTO saveQuestion(@RequestBody Question question, @PathVariable("user-id") int userId, @PathVariable("tag-id") int tagId) {
        return questionService.saveQuestion(question, userId, tagId);
    }

    @PutMapping("/{question-id}")
    public QuestionDTO updateQuestion(@RequestBody String text, @PathVariable("question-id") int questionId) {
        return questionService.updateQuestion(text, questionId);
    }

    @PutMapping("/{question-id}/like")
    public int like(@PathVariable("question-id") int id) {
        Question question = questionRepository.findById(id);
        question.setVoteCount(question.getVoteCount() + 1);
        questionRepository.save(question);

        return question.getVoteCount();
    }

    @PutMapping("/{question-id}/dislike")
    public int dislike(@PathVariable("question-id") int id) {
        Question question = questionRepository.findById(id);
        question.setVoteCount(question.getVoteCount() - 1);
        questionRepository.save(question);

        return question.getVoteCount();
    }
}
