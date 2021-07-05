package com.test.provider.entity;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.Date;

//向队列里传值
@Component
public class Sender {
    @Autowired
    AmqpTemplate amqpTemplate;

    public  void  send(){
        String context="hello+"+new Date();
        System.out.println("Sender:"+context);
        this.amqpTemplate.convertAndSend("hello",context);
    }
}
