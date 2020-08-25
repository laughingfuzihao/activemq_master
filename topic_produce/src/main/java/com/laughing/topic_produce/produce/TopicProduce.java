package com.laughing.topic_produce.produce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.jms.Topic;
import java.util.Date;
import java.util.UUID;

/**
 * @author Fu zihao
 * @version 1.0
 * @Description:
 * @date 20202020/8/25 13:47
 */


@Component
public class TopicProduce {
    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;

    @Autowired
    private Topic topic;

    @Scheduled(fixedDelay = 3000)
    public void produceTopic() {

        jmsMessagingTemplate.convertAndSend(topic,
                "topic消息：" + UUID.randomUUID().toString().substring(0, 6));
        System.out.println("topic消息发送" + new Date());


    }
}
