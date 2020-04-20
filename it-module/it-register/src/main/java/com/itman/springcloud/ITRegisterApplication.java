package com.itman.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author zhangke
 * @date 2020/4/20 21:40
 **/
@EnableDiscoveryClient
@SpringBootApplication
public class ITRegisterApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(ITRegisterApplication.class, args);
    }
}
