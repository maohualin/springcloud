package com.loneranger.eurekacustom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class EurekacustomApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekacustomApplication.class, args);
    }
}
