package project.school.repository;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;
import project.school.entity.Topic;

import java.util.List;

import static org.junit.Assert.*;


@RunWith(SpringRunner.class)
@DataJpaTest
public class TopicRepositoryTest {

    @Autowired
    private TestEntityManager testEntityManager;

    @Autowired
    private TopicRepository topicRepository;

    @Test
    public void when_no_data_return_empty_list() {
        //given

        //when
        List<Topic> topics = topicRepository.findAll();

        //then
        Assert.assertEquals(0, topics.size());
    }

    @Test
    public void when_save_data_then_return_two_item_list() {
        //given
        Topic topic = new Topic();
        topic.setSection("x");
        topic.setSubject("y");
        testEntityManager.persist(topic);

        Topic topic1 = new Topic();
        topic1.setSection("z");
        topic1.setSubject("y2");
        testEntityManager.persist(topic1);

        //when
        List<Topic> topics = topicRepository.findAll();

        //then
        Assert.assertEquals(2, topics.size());
    }

}