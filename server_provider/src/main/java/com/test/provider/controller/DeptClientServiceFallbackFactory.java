package com.test.provider.controller;

import com.test.provider.entity.Sender;
import feign.hystrix.FallbackFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
public class DeptClientServiceFallbackFactory implements FallbackFactory<ProviderController> {


	public ProviderController create(Throwable cause) {
		return new ProviderController(){

			@Autowired
			private Sender sender;
			@Override
			public String getData(){
				return "提供了数据";
			}

			@Override
			public void send(){
				sender.send();
			}


		};
	}
}
