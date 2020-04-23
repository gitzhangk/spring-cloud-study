package com.itman.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author zhangke
 * @date 2020/4/21 22:20
 **/
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class ITEducationApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(ITEducationApplication.class, args);
    }
}
