package com.example.serviceturbine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

//访问 Hystrix Dashboard 对多个实例监控 还是没什么用
// 并开启对 http://localhost:8090/turbine.stream 的监控，这时候，
// 我们将看到针对服务 service-hystrix-feign 与 service-hystrix-ribbon 的聚合监控数据

@EnableTurbine
@SpringBootApplication
public class ServiceTurbineApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceTurbineApplication.class, args);
    }

}
