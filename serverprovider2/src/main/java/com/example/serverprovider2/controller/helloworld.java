package com.example.serverprovider2.controller;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloworld {


    @Value("${server.port}")
     String serverPort;

    @RequestMapping("/test")
    @ResponseBody
    public String test(){
        return "hello123"+serverPort;
    }

}
