package com.example.serverprovider2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class Serverprovider2Application {

    public static void main(String[] args) {
        SpringApplication.run(Serverprovider2Application.class, args);
    }

}
