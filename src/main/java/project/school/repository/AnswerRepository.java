package project.school.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.school.entity.Question;

public interface AnswerRepository extends JpaRepository<Question, Long> {
}
