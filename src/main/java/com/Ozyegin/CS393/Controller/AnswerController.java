package com.Ozyegin.CS393.Controller;

import com.Ozyegin.CS393.DTO.AnswerDTO;
import com.Ozyegin.CS393.Model.Answer;
import com.Ozyegin.CS393.Service.AnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/answers")
public class AnswerController {
    @Autowired
    AnswerService answerService;

    @GetMapping
    public List<AnswerDTO> findAll(){ return answerService.findAll(); }

    @GetMapping("/{answer-id}")
    public AnswerDTO getAnswerById(@PathVariable("answer-id") int id) { return answerService.findById(id); }

    @DeleteMapping("/{answer-id}")
    public void deleteById(@PathVariable("answer-id") int id){ answerService.deleteById(id); }

    @PostMapping
    public Answer save(@RequestBody Answer answer){ return answerService.save(answer); }
}
