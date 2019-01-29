package com.jza.dubbo.start.server.service.impl;


import com.alibaba.dubbo.config.annotation.Service;
import com.jza.dubbo.start.api.service.UserService;

@Service(version = "1.0.0")
public class UserServiceImpl implements UserService {

    @Override
    public String findUser() {
        return "jza";
    }
}
