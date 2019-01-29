package com.za.dubbo.start.consumer.invoke;

import com.alibaba.dubbo.config.annotation.Reference;
import com.jza.dubbo.start.api.service.UserService;
import org.apache.catalina.User;
import org.springframework.stereotype.Component;

@Component
public class UserInvoke {

    @Reference(version = "1.0.0")
    private UserService userService;
//
    public String findUser() {
        return userService.findUser();
    }

}
