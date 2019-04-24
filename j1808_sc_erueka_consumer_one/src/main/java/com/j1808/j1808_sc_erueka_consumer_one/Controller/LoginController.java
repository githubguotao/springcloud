package com.j1808.j1808_sc_erueka_consumer_one.Controller;

import com.j1808.j1808_sc_erueka_consumer_one.Service.RemoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
        @Autowired
        RemoteService remoteService;

        @RequestMapping("/login")

        public String login(@RequestParam("name") String name){

            String list = remoteService.fetchInfo(name);

            return list;

        }

}
