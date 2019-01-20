package project.school.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.school.entity.Answer;
import project.school.entity.Question;
import project.school.repository.AnswerRepository;
import project.school.repository.QuestionRepository;

import java.util.List;

@Service
public class AnswerService {
    @Autowired
    private AnswerRepository answerRepository;

    public List<Answer> getAllAnswers(){
        return answerRepository.findAll();
    }
    public void addAnswer(Answer answer){

        answerRepository.save(answer);
    }
}
