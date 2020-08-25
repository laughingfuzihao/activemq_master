package com.laughing.topic_produce.config;

import org.apache.activemq.command.ActiveMQTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.jms.Topic;

/**
 * @author Fu zihao
 * @version 1.0
 * @Description:
 * @date 20202020/8/25 13:48
 */
@Component
public class TopicConfigBean {
    @Value("${topic}")
    private String topicName;

    @Bean
    public Topic topic() {
        return new ActiveMQTopic(topicName);
    }
}
