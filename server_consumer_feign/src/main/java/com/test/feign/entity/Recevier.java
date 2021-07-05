package com.test.feign.entity;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "hello")
public class Recevier {

    @RabbitHandler//指定对消息的处理方法
    public  void process(String hello){
        System.out.println("Receiver:"+hello);
    }
}
