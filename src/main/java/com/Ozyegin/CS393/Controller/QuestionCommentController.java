package com.Ozyegin.CS393.Controller;

import com.Ozyegin.CS393.DTO.QuestionCommentDTO;
import com.Ozyegin.CS393.Model.QuestionComment;
import com.Ozyegin.CS393.Service.QuestionCommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/questioncomments")
public class QuestionCommentController {
    @Autowired
    QuestionCommentService questionCommentService;

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
}
