package com.example.servicehystrixdashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;


//监控程序某端口运行情况 感觉一般没什么用
//在Hystrix-Dashboard 的主界面上输入service-hystrix-feign对应的地址 http://localhost:9002/actuator/hystrix.stream
// 然后点击 Monitor Stream 按钮，进入页面如果没有请求会一直显示 “Loading…”，这时访问 http://localhost:9002/actuator/hystrix.stream
// 也是不断的显示“ping”，然后访问一下 http://localhost:9002/getPoducerInfoByFeign，可以看到 Hystrix Dashboard 中出现了类似下面的效果

@EnableHystrixDashboard
@SpringBootApplication
public class ServiceHystrixDashboardApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceHystrixDashboardApplication.class, args);
    }

}
