package project.school.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import project.school.entity.Answer;
import project.school.repository.AnswerRepository;

import java.util.List;

@RestController
public class AnswerController {

    @Autowired
    private AnswerRepository answerRepository;

    @GetMapping("/answer")
    @ResponseBody
    public List<Answer> getAllAnswers() {
        return answerRepository.findAll();
    }

    @PostMapping("answer")
    public void addAnswer(@RequestBody Answer answer) {
        answerRepository.save(answer);
    }

}
