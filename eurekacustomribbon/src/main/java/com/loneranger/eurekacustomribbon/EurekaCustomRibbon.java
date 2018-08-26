package com.loneranger.eurekacustomribbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class EurekaCustomRibbon {

@Bean
@LoadBalanced
public   RestTemplate restTemplate(){
return new RestTemplate();
}
@Autowired
RestTemplate restTemplate;
@GetMapping("/hello")
public String hell0(){
    String url="http://eureka-client/hello";
    return  restTemplate.getForObject(url,String.class);

}
}
