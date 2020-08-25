package com.laughing.activemq_produce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class ActivemqProduceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ActivemqProduceApplication.class, args);
    }

}
