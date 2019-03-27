package com.text.eurekafeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "eureka-client",fallback = SchedualServiceHiHystric.class)
public interface SchedualEurekaClient {

    @RequestMapping(value = "/hi",method =RequestMethod.GET )
    String sayHiFromClientOne(@RequestParam(value = "name")String name);
}