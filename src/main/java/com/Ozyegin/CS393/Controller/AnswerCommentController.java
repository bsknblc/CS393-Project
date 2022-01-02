package com.Ozyegin.CS393.Controller;

import com.Ozyegin.CS393.DTO.AnswerCommentDTO;
import com.Ozyegin.CS393.DTO.QuestionCommentDTO;
import com.Ozyegin.CS393.Model.Answer;
import com.Ozyegin.CS393.Model.AnswerComment;
import com.Ozyegin.CS393.Model.QuestionComment;
import com.Ozyegin.CS393.Repository.AnswerCommentRepository;
import com.Ozyegin.CS393.Service.AnswerCommentService;
import com.Ozyegin.CS393.Service.QuestionCommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/answercomments")
public class AnswerCommentController {
    @Autowired
    AnswerCommentService answerCommentService;
    AnswerCommentRepository answerCommentRepository;

    @GetMapping
    public List<AnswerCommentDTO> findAll(){ return answerCommentService.findAll(); }

    @GetMapping("/{answerComment-id}")
    public AnswerCommentDTO getAnswerCommentById(@PathVariable("answerComment-id") int id) {return answerCommentService.findById(id); }

    @DeleteMapping("/{answerComment-id}")
    public void deleteById(@PathVariable("answerComment-id") int id){ answerCommentService.deleteById(id); }

    @PostMapping
    public AnswerComment save(@RequestBody AnswerComment answerComment){
        return answerCommentService.save(answerComment);
    }

    @PostMapping("/user/{user-id}/answer/{answer-id}")
    public AnswerCommentDTO saveAnswerComment(@RequestBody AnswerComment answerComment, @PathVariable("user-id") int userId, @PathVariable("answer-id") int answerId) {
        return answerCommentService.saveAnswerComment(answerComment, userId, answerId);
    }

    @PutMapping("/{answerComment-id}/like")
    public int like(@PathVariable("answerComment-id") int id) {
        AnswerComment answerComment = answerCommentRepository.findById(id);
        answerComment.setVoteCount(answerComment.getVoteCount() + 1);
        answerCommentRepository.save(answerComment);

        return answerComment.getVoteCount();
    }

    @PutMapping("/{answerComment-id}/dislike")
    public int dislike(@PathVariable("answerComment-id") int id) {
        AnswerComment answerComment = answerCommentRepository.findById(id);
        answerComment.setVoteCount(answerComment.getVoteCount() - 1);
        answerCommentRepository.save(answerComment);

        return answerComment.getVoteCount();
    }
}
