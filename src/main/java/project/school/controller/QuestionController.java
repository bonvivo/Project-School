package project.school.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import project.school.entity.Question;
import project.school.repository.QuestionRepository;

import java.util.List;

@RestController
public class QuestionController {

    @Autowired
    private QuestionRepository questionRepository;

    @GetMapping("/question")
    @ResponseBody
    public List<Question> getAllQuestions(){
        return questionRepository.findAll();
    }

    @PostMapping("question")
    public void addQuestion(@RequestBody Question question){
        questionRepository.save(question);
    }
}
