package project.school.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.school.entity.Question;
import project.school.repository.QuestionRepository;

import java.util.List;

@Service
public class QuestionService {
    @Autowired
    private QuestionRepository questionRepository;

    public List<Question> getAllQuestions(){
        return questionRepository.findAll();
    }
    public void addQuestion(Question question){

        questionRepository.save(question);
    }
}
