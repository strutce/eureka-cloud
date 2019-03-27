package com.text.eurekafeign.service;


import org.springframework.stereotype.Component;

@Component
public class SchedualServiceHiHystric implements SchedualEurekaClient {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry"+name;
    }
}
