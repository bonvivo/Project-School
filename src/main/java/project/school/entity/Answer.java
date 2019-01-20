package project.school.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "answer")
public class Answer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_answer")
    private long idAnswer;

    @ManyToOne
    private Question question;

    @Column(name = "answer_contents")
    private String answerContents;

    @Column(name = "answer_correct")
    private boolean answerCorrect;

    public Answer() {
    }

    public long getIdAnswer() {
        return idAnswer;
    }

    public void setIdAnswer(long idAnswer) {
        this.idAnswer = idAnswer;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public String getAnswerContents() {
        return answerContents;
    }

    public void setAnswerContents(String answerContents) {
        this.answerContents = answerContents;
    }

    public boolean isAnswerCorrect() {
        return answerCorrect;
    }

    public void setAnswerCorrect(boolean answerCorrect) {
        this.answerCorrect = answerCorrect;
    }
}
