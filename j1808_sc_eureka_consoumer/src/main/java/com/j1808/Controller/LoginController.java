package com.j1808.Controller;

import com.j1808.service.RemoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.naming.Name;

@Controller
public class LoginController {
    @Autowired(required = false)
    RemoteService remoteService;

    @RequestMapping("/login")
    @ResponseBody
    public String Login(@RequestParam("name") String name){
        String info = remoteService.getInfo(name);
        return info;
    }
}
