package com.example.consumer.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class consumer {
    @Autowired
    RestTemplate restTemplate;
    @RequestMapping("/hahaha")
    @ResponseBody
    public String test(){

        return this.restTemplate.getForObject("http://bootwang/test", String.class);
    }


}
