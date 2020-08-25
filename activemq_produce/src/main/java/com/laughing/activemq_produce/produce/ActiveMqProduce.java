package com.laughing.activemq_produce.produce;

import com.laughing.activemq_produce.config.ActiveMqConfigBean;
import org.checkerframework.checker.units.qual.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.jms.Queue;
import java.util.Date;
import java.util.UUID;

/**
 * @author Fu zihao
 * @version 1.0
 * @Description:
 * @date 20202020/8/25 11:02
 */
@Component
public class ActiveMqProduce {

    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;

    @Autowired
    private Queue queue;


    public void produceMsg() {
        jmsMessagingTemplate.convertAndSend(queue,
                "jmsMessagingTemplate生产:" + UUID.randomUUID().toString().substring(0, 6));
        System.out.println("生产者发送一条消息" + new Date());
    }

    /**
     * 间隔投递消息
     */
    @Scheduled(fixedDelay = 3000)
    public void produceMsgScheduled() {
        jmsMessagingTemplate.convertAndSend(queue,
                "jmsMessagingTemplate生产:" + UUID.randomUUID().toString().substring(0, 6));
        System.out.println("生产者发送一条消息" + new Date());

    }

}
