package com.test.feign.controller;

import com.test.feign.client.DataClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("consumer")
public class DataFeignController {

    @Autowired
    private DataClient dataClient;

    private SpringContextHolder springContextHolder;

    @RequestMapping("feignGet")
    public String get(){

//        Object dataClient = SpringContextHolder.getBean("dataClient");
        DataClient bean1 = SpringContextHolder.getBean(DataClient.class);

        System.out.println(dataClient);
        System.out.println(bean1);

        return this.dataClient.getData();
    }

    @RequestMapping("feignSend")
    public String send(){
        return dataClient.getSend();
    }
}
