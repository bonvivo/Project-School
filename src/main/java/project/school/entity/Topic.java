package project.school.entity;

import org.aspectj.weaver.patterns.TypePatternQuestions;

import javax.persistence.*;
import javax.security.auth.Subject;
import java.util.List;

@Entity
@Table(name = "topic")
public class Topic {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_topic")
    private long idTopic;

    @Column(name = "subject")
    private String subject;

    @Column(name = "section")
    private String section;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Question> questionList;

    public Topic() {
    }

    public long getIdTopic() {
        return idTopic;
    }

    public void setIdTopic(long idTopic) {
        this.idTopic = idTopic;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public List<Question> getQuestionList() {
        return questionList;
    }

    public void setQuestionList(List<Question> questionList) {
        this.questionList = questionList;
    }
}
