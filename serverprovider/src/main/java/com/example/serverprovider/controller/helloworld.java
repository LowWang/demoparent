package com.example.serverprovider.controller;



import com.example.serverprovider.entity.User;
import com.example.serverprovider.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloworld {

    @Autowired
    private UserService userservice;
    @Value("${server.port}")
     String serverPort;

    @RequestMapping("/test")
    @ResponseBody
    public String test(){
        User user = null;
        try {
            user=userservice.finduser();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println(user);
        return "hello1sda"+serverPort;
    }

    @GetMapping("/getuser")
    public String getuser(int i){
        User user =userservice.getEmp(i);
        return user.getId();
    }

}
