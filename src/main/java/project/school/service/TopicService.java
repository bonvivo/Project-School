package project.school.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import project.school.entity.Topic;
import project.school.repository.TopicRepository;

import java.util.List;

@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;

    public List<Topic> getAllTopics() {

        return topicRepository.findAll();
    }

    public void addTopic(Topic topic){
        topicRepository.save(topic);

    }

}
