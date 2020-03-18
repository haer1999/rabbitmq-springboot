package com.example.rabbitmqspringboot;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * created by cxming on 2020/3/18
 */
@Configuration
public class RabbitConfig {
    @Bean
    public Queue helloQueue() {
        return new Queue("q_hello");
    }

    @Bean
    public Queue workQueue() {
        return new Queue("q_work");
    }
}