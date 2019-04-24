package com.j1808.controller;

import com.j1808.service.HystrixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HystrixController {
    @Autowired
    private HystrixService hystrixService;

    @RequestMapping("/login")
    public String login(@RequestParam("name") String name) {
        return hystrixService.getInfo(name);
    }
}
