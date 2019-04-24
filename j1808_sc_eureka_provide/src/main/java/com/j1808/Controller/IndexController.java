package com.j1808.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @RequestMapping("/hello")

    public String sayHello(String name){

        return name+",welcome to spring colud world";
    }

}
