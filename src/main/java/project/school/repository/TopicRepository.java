package project.school.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import project.school.entity.Topic;

public interface TopicRepository extends JpaRepository<Topic, Long> {

}
