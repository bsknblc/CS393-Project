package com.Ozyegin.CS393.Controller;

import com.Ozyegin.CS393.DTO.QuestionCommentDTO;
import com.Ozyegin.CS393.DTO.QuestionDTO;
import com.Ozyegin.CS393.Model.AnswerComment;
import com.Ozyegin.CS393.Model.Question;
import com.Ozyegin.CS393.Model.QuestionComment;
import com.Ozyegin.CS393.Repository.QuestionCommentRepository;
import com.Ozyegin.CS393.Service.QuestionCommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/questioncomments")
public class QuestionCommentController {
    @Autowired
    QuestionCommentService questionCommentService;
    QuestionCommentRepository questionCommentRepository;

    @GetMapping
    public List<QuestionCommentDTO> findAll(){ return questionCommentService.findAll(); }

    @GetMapping("/{questionComment-id}")
    public QuestionCommentDTO getQuestionCommentById(@PathVariable("questionComment-id") int id) {return questionCommentService.findById(id); }

    @DeleteMapping("/{questionComment-id}")
    public void deleteById(@PathVariable("questionComment-id") int id){ questionCommentService.deleteById(id); }

    @PostMapping
    public QuestionComment save(@RequestBody QuestionComment questionComment){
        return questionCommentService.save(questionComment);
    }

    @PostMapping("/user/{user-id}/question/{question-id}")
    public QuestionCommentDTO saveQuestionComment(@RequestBody QuestionComment questionComment, @PathVariable("user-id") int userId, @PathVariable("question-id") int questionId) {
        return questionCommentService.saveQuestionComment(questionComment, userId, questionId);
    }

    @PutMapping("/{questionComment-id}/like")
    public int like(@PathVariable("questionComment-id") int id) {
        QuestionComment questionComment = questionCommentRepository.findById(id);
        questionComment.setVoteCount(questionComment.getVoteCount() + 1);
        questionCommentRepository.save(questionComment);

        return questionComment.getVoteCount();
    }

    @PutMapping("/{questionComment-id}/dislike")
    public int dislike(@PathVariable("questionComment-id") int id) {
        QuestionComment questionComment = questionCommentRepository.findById(id);
        questionComment.setVoteCount(questionComment.getVoteCount() - 1);
        questionCommentRepository.save(questionComment);

        return questionComment.getVoteCount();
    }
}
