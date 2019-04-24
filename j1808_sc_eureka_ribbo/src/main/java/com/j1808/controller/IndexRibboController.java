package com.j1808.controller;

import com.j1808.service.HystrixRibboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.lang.annotation.Repeatable;

@RestController
public class IndexRibboController {

    @Autowired
    private HystrixRibboService hystrixRibboService;
    @RequestMapping("/login")
    public String indexRibbo(@RequestParam("name") String name){
        String htstrixRibbo = hystrixRibboService.getHtstrixRibbo(name);
        return htstrixRibbo;

    }

}
