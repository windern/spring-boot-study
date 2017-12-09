package com.windern.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "com.windern.demo")
public class ConfigBean {
    private String name;
    private String wanted;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWanted() {
        return wanted;
    }

    public void setWanted(String wanted) {
        this.wanted = wanted;
    }
}
