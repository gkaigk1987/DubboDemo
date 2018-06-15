package com.gk.dubbo.consumer;

import com.gk.dubbo.service.IDemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Consumer {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:consumer.xml");
        context.start();
        IDemoService demoService = (IDemoService) context.getBean("demoService");
        String gk = demoService.sayHello("gk");
        System.out.println(gk);
    }
}
