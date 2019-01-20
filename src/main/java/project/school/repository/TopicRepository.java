package project.school.repository;


import project.school.entity.Topic;

import java.util.List;

public interface TopicRepository {

    void add(Topic topic);

    void delete(long idTopic);

    void update(String ID, Topic topic);

    List<Topic> getAll();

}
