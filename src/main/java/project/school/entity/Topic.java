package project.school.entity;

import javax.persistence.*;

@Entity
@Table(name = "Topic")
public class Topic {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "topicID")
    private long topic_ID;

    @Column(name = "subject")
    private String subject;

    @Column(name = "section")
    private String section;

    public Topic() {
    }

    public long getTopic_ID() {
        return topic_ID;
    }

    public void setTopic_ID(long topic_ID) {
        this.topic_ID = topic_ID;
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
}
