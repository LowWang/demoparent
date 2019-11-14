package com.example.serviceapigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

//在集群里面就是所有spring boot 的一个入口



@EnableZuulProxy
@SpringBootApplication
public class ServiceApiGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceApiGatewayApplication.class, args);
    }

}
