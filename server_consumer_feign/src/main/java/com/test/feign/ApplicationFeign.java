package com.test.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients("com.test.feign.client") 	//feign接口的地址（上图的client目录）
public class ApplicationFeign {
    public static void main(String[] args){
        SpringApplication.run(ApplicationFeign.class);
    }
}
