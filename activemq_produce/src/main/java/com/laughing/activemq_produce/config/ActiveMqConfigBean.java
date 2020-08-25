package com.laughing.activemq_produce.config;



import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.stereotype.Component;

import javax.jms.Queue;


/**
 * @author Fu zihao
 * @version 1.0
 * @Description:
 * @date 20202020/8/25 10:57
 */
@Component
@EnableJms
public class ActiveMqConfigBean {
    // 队列名称
    @Value("${queue}")
    private String queue;

    @Bean
    public Queue queue(){
        return  new ActiveMQQueue(queue);
    }

}
