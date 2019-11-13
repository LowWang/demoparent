package com.example.feign.controllerImp;

import org.springframework.stereotype.Component;


@Component
public class ConsumerFeignClientFallback{

    public String gettest() {
        return "服务调用失败";
    }
}
