package com.example.rabbitmqspringboot.workqueue;

import com.example.rabbitmqspringboot.simplequeue.HelloSender;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * created by cxming on 2020/3/18
 */
@SpringBootTest
public class WorkQueueTest {

    @Autowired
    private WorkSender workSender;

    @Test
    public void workQueueTest() throws Exception {
        for (int i=0;i<100;i++){
            workSender.send(i);
            Thread.sleep(30);
        }
    }

}
