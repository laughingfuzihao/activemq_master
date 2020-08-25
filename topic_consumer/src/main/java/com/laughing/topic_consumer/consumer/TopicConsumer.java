package com.laughing.topic_consumer.consumer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import javax.jms.JMSException;
import javax.jms.TextMessage;

/**
 * @author Fu zihao
 * @version 1.0
 * @Description:
 * @date 20202020/8/25 13:57
 */
@Component
public class TopicConsumer {

    @JmsListener(destination = "${topic}")
    public void receive(TextMessage textMessage){
        try {
            System.out.println("消费者接收消息"+ textMessage.getText());
        } catch (JMSException e) {
            e.printStackTrace();
        }

    }
}
