package com.learn.provider.impl;

import com.learn.api.demoService.DemoService;

import java.io.IOException;

@com.alibaba.dubbo.config.annotation.Service(version = "demoService")
public class DemoServiceImpl implements DemoService {

    @Override
    public String sayHello(String name){
        String hello = "hello:" + name  ;
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return hello;
    }
}
