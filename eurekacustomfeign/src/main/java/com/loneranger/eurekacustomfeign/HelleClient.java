package com.loneranger.eurekacustomfeign;


import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("eureka-client")
public interface HelleClient {
    @GetMapping("/hello")
    public String hello();
}
