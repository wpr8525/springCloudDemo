package com.test.provider.controller;

import com.test.provider.entity.Sender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/provider")
public class ProviderController {

    @Autowired
    private Sender sender;
    @RequestMapping("/get")
    public String getData(){
        return "提供了数据";
    }

    @RequestMapping("/send")
    public void send(){
        sender.send();
    }
}

