package com.example.feign.controller;

import com.example.feign.controllerImp.ConsumerFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    @Autowired
    private ConsumerFeignClient feignClient;

    @GetMapping("/getFeign")
    public String getPoducerInfoByFeign() {
        return feignClient.gettest();
    }
}
