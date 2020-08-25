package com.laughing.activemq_produce;

import com.laughing.activemq_produce.produce.ActiveMqProduce;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ActivemqProduceApplicationTests {
    @Autowired
    private ActiveMqProduce activeMqProduce;

    @Test
    void contextLoads() {
        // 测试往Queue发送生产者消息
        activeMqProduce.produceMsg();
    }

    @Test
    void contextLoadsScheduled() {
        // 测试往Queue发送生产者消息
        activeMqProduce.produceMsgScheduled();
    }



}
