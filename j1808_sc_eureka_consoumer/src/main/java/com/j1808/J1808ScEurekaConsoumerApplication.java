package com.j1808;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient  //发现提供者，此为消费者
@EnableFeignClients     //仪feign实现负载均衡
public class J1808ScEurekaConsoumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(J1808ScEurekaConsoumerApplication.class, args);
    }

}
