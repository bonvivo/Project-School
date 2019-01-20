package project.school.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "question")
public class Question {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_question")
    private long idQuestion;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Answer> answer;

    @ManyToOne
    private Topic topic;

    @Column(name = "contents")
    private String contents;

    public Question() {
    }

    public long getIdQuestion() {
        return idQuestion;
    }

    public void setIdQuestion(long idQuestion) {
        this.idQuestion = idQuestion;
    }

    public List<Answer> getAnswer() {
        return answer;
    }

    public void setAnswer(List<Answer> answer) {
        this.answer = answer;
    }

    public Topic getTopic() {
        return topic;
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }
}
