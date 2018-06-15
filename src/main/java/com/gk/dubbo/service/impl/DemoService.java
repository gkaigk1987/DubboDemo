package com.gk.dubbo.service.impl;

import com.gk.dubbo.service.IDemoService;

public class DemoService implements IDemoService {

    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }
}
