package com.j1808;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy //开启路由代理
public class J1808ScEurekaZullApplication {

    public static void main(String[] args) {
        SpringApplication.run(J1808ScEurekaZullApplication.class, args);
    }

}
