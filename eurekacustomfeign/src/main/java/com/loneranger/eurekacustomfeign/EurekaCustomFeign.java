package com.loneranger.eurekacustomfeign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class EurekaCustomFeign {
@Autowired
    HelleClient helleClient;
@GetMapping("/hello")
public String hell0(){
   return  helleClient.hello();
}
}
