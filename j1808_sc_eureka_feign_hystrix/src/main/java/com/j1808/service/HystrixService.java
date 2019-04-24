package com.j1808.service;

import com.j1808.service.impl.HystrixServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "eureka-provide",fallback = HystrixServiceImpl.class)
public interface HystrixService {

    @RequestMapping("/hello")
    public String getInfo(@RequestParam("name") String name);



}
