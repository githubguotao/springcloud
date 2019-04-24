package com.j1808.service.impl;

import com.j1808.service.HystrixRibboService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HystrixRibboServiceImpl implements HystrixRibboService {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "ribboHysrix")

    @Override
    public String getHtstrixRibbo(String name) {

        String forObject = restTemplate.getForObject("http://EUREKA-PROVIDE/hello?name=" + name, String.class);
        return forObject;
    }


    public String ribboHysrix(String name){
        return name+"welcome ribbo hystrix world";
    }
}
