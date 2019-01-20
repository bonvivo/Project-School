package project.school.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import project.school.entity.Topic;
import project.school.repository.TopicRepository;
import java.util.List;

@RestController
public class TopicController {

    @Autowired
    private TopicRepository topicRepository;

    @GetMapping("/topics")
    @ResponseBody
    public List<Topic> getAllTopics() {
        return topicRepository.findAll();
    }

    @PostMapping("/topics")
    public void addTopic (@RequestBody Topic topic){
        topicRepository.save(topic);
    }
}