package com.jza.dubbo.start.server.Service.Impl;

import com.jza.dubbo.start.api.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public String findUser() {
        return "jza";
    }
}
