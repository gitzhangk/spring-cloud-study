package com.itman.springcloud.edu.trainplan.service;

import com.itman.springclou.entity.register.worker.WorkerFeignDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "it-cloud-register",fallbackFactory = TrainServiceFallback.class)
@RequestMapping("worker")
public interface TrainServiceFeign
{
    @GetMapping("/findById/{id}")
    WorkerFeignDTO findById(@PathVariable("id") String id);
}
