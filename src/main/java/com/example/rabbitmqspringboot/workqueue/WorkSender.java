package com.example.rabbitmqspringboot.workqueue;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * created by cxming on 2020/3/18
 */
@Component
public class WorkSender {

    @Autowired
    RabbitTemplate rabbitTemplate;

    public void send(int i) {
        String date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());//24小时制
        String content = "hello " + i + " " + date;
        System.out.println("Sender : " + content);
        //简单对列的情况下routingKey即为Q名
        rabbitTemplate.convertAndSend("q_work", content);
    }

}
