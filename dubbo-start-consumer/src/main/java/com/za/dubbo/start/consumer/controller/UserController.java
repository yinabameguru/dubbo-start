package com.za.dubbo.start.consumer.controller;

import com.za.dubbo.start.consumer.invoke.UserInvoke;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserInvoke userInvoke;

    @RequestMapping("/get")
    public String getUser() {
//        return "a";
        return userInvoke.findUser();
    }

}
