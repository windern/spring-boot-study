package com.windern.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    @Autowired
    ConfigBean configBean;

    @RequestMapping("/")
    public String hello() {
        return configBean.getName() + ":" + configBean.getWanted();
    }
}
