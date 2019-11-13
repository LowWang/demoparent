package com.example.consumer.controller;


import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


//作为消费者消费服务，

@RestController
public class consumer {
    @Autowired
    RestTemplate restTemplate;
    @RequestMapping("/hahaha")
    @HystrixCommand(fallbackMethod = "getPoducerInfoFallback")
    @ResponseBody
    public String test(){

        return this.restTemplate.getForObject("http://bootwang/test", String.class);
    }
    public String getPoducerInfoFallback(){
        return "getPoducerInfo异常" ;
    }

}
