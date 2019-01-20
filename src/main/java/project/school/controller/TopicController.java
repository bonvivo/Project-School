package project.school.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import project.school.entity.Topic;
import project.school.repository.TopicRepository;
import project.school.service.TopicService;

import java.util.List;

@RestController
public class TopicController {

    @Autowired
    private TopicService topicService;

    @GetMapping("/topics")
    @ResponseBody
    public List<Topic> getAllTopics() {
        return topicService.getAllTopics();
    }

    @PostMapping("/topics")
    public void addTopic (@RequestBody Topic topic){
        topicService.addTopic(topic);
    }
}