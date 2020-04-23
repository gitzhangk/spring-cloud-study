package com.itman.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author zhangke
 * @date 2020/4/21 22:20
 **/
@EnableDiscoveryClient
@SpringBootApplication
public class ITEducationApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(ITEducationApplication.class, args);
    }
}
