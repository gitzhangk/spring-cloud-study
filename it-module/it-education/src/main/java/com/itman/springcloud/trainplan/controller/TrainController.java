package com.itman.springcloud.trainplan.controller;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author zhangke
 * @date 2020/4/21 22:42
 **/
@RestController
@AllArgsConstructor
@RequestMapping("train")
public class TrainController
{
    @Autowired
    private final RestTemplate restTemplate;

    @GetMapping("/findWorkerById/{id}")
    public String findWorkerById(@PathVariable("id") String id)
    {
        return restTemplate.getForObject("http://127.0.0.1:8010/worker/findById/"+id,String.class);
    }
}
