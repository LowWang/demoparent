package com.example.serverprovider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@MapperScan("com.example.serverprovider.mapper")
@EnableDiscoveryClient
@SpringBootApplication
@EnableCaching
public class ServerproviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServerproviderApplication.class, args);
    }

}
