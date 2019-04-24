package com.j1808.j1808_sc_erueka_consumer_one.Service.impl;

import com.j1808.j1808_sc_erueka_consumer_one.Service.RemoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RemoteServiceImpl implements RemoteService {
    @Autowired

    private RestTemplate restTemplate;

    @Override
    public String fetchInfo(String name) {
        String object = restTemplate.getForObject("http://EUREKA-PROVIDE/hello?name=" + name, String.class);

        return object;
    }
}
