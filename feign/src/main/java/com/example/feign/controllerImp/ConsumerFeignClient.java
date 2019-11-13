package com.example.feign.controllerImp;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "bootwang",fallback = ConsumerFeignClientFallback.class)
public interface  ConsumerFeignClient {

    @GetMapping("/test")
     public String gettest();
}
