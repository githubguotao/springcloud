package com.j1808.service.impl;

import com.j1808.service.HystrixService;
import org.springframework.stereotype.Service;

@Service
public class HystrixServiceImpl implements HystrixService {


    @Override
    public String getInfo(String name) {
        return "welcome to  feign Hystrix world";
    }
}
