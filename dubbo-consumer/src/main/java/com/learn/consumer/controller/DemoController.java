package com.learn.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.learn.api.demoService.DemoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("demo")
public class DemoController {

    @Reference(version = "demoService")
    private DemoService demoService;


    @RequestMapping(value = "hello",method = RequestMethod.POST)
    public void demoController(@RequestParam(value = "name", required = true)String name){
        String hello = demoService.sayHello(name);
        System.out.println(hello);


    }

}
