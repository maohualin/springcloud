package com.loneranger.eurekaclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
   @Autowired
   DiscoveryClient discoveryClient;
   @GetMapping("/hello")
    public String hello(){
        return  discoveryClient.getServices().get(0);
    }
}
