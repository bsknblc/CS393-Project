package com.Ozyegin.CS393.Controller;

import com.Ozyegin.CS393.DTO.AnswerDTO;
import com.Ozyegin.CS393.DTO.QuestionDTO;
import com.Ozyegin.CS393.Model.Answer;
import com.Ozyegin.CS393.Model.Question;
import com.Ozyegin.CS393.Repository.AnswerRepository;
import com.Ozyegin.CS393.Service.AnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/answers")
public class AnswerController {
    @Autowired
    AnswerService answerService;
    AnswerRepository answerRepository;

    @GetMapping
    public List<AnswerDTO> findAll(){ return answerService.findAll(); }

    @GetMapping("/{answer-id}")
    public AnswerDTO getAnswerById(@PathVariable("answer-id") int id) { return answerService.findById(id); }

    @DeleteMapping("/{answer-id}")
    public void deleteById(@PathVariable("answer-id") int id){ answerService.deleteById(id); }

    @PostMapping
    public Answer save(@RequestBody Answer answer){ return answerService.save(answer); }

    @PostMapping("/user/{user-id}/question/{question-id}")
    public AnswerDTO saveAnswer(@RequestBody Answer answer, @PathVariable("user-id") int userId, @PathVariable("question-id") int questionId) {
        return answerService.saveAnswer(answer, userId, questionId);
    }

    @PutMapping("/{answer-id}")
    public AnswerDTO updateAnswer(@RequestBody String text, @PathVariable("answer-id") int answerId) {
        return answerService.updateAnswer(text, answerId);
    }

    @PutMapping("/{answer-id}/like")
    public int like(@PathVariable("answer-id") int id) {
    Answer answer = answerRepository.findById(id);
    answer.setVoteCount(answer.getVoteCount() + 1);
    answerRepository.save(answer);

    return answer.getVoteCount();
    }

    @PutMapping("/{answer-id}/dislike")
    public int dislike(@PathVariable("answer-id") int id) {
        Answer answer = answerRepository.findById(id);
        answer.setVoteCount(answer.getVoteCount() - 1);
        answerRepository.save(answer);

        return answer.getVoteCount();
    }
}
