package com.example.rabbitmqspringboot.workqueue;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * created by cxming on 2020/3/18
 */
@Component
@RabbitListener(queues = "q_work")
public class WorkReceiver2 {

    @RabbitHandler
    public void process(String msg) {
        System.out.println("WorkReceiver222:" + msg);
    }

}
