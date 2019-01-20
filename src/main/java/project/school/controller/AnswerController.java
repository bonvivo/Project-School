package project.school.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import project.school.entity.Answer;
import project.school.service.AnswerService;

import java.util.List;

@RestController
public class AnswerController {

    @Autowired
    private AnswerService answerService;

    @GetMapping("/answer")
    @ResponseBody
    public List<Answer> getAllAnswers() {
        return answerService.getAllAnswers();
    }

    @PostMapping("answer")
    public void addAnswer(@RequestBody Answer answer) {
        answerService.addAnswer(answer);
    }
}
