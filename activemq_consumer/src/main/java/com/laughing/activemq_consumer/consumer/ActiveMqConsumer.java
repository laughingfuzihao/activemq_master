package com.laughing.activemq_consumer.consumer;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import javax.jms.JMSException;
import javax.jms.TextMessage;

/**
 * @author Fu zihao
 * @version 1.0
 * @Description:
 * @date 20202020/8/25 11:40
 */
@Component
public class ActiveMqConsumer {

    @JmsListener(destination = "${queue}")
    public void  receive(TextMessage textMessage ) throws JMSException {
        System.out.println("消费者接收消息"+textMessage.getText());

    }
}
