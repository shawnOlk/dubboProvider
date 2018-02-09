package com.dubboprovider.service;


import com.alibaba.dubbo.config.annotation.Service;

@Service(version = "1.0.0")
public class UserServiceImpl implements UserService {
    @Override
    public String getUserName() {
        System.out.println("Being invoked");
        return "test user";
    }
}