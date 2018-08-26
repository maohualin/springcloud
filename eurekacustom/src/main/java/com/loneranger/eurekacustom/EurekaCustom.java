package com.loneranger.eurekacustom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class EurekaCustom {

@Bean
public   RestTemplate restTemplate(){
return new RestTemplate();
}
@Autowired
RestTemplate restTemplate;
@Autowired
LoadBalancerClient loadBalancerClient;
@GetMapping("/hello")
public String hell0(){
    ServiceInstance choose = loadBalancerClient.choose("eureka-client");
    String url="http://"+choose.getHost()+":"+choose.getPort()+"/hello";
    return  restTemplate.getForObject(url,String.class);

}
}
