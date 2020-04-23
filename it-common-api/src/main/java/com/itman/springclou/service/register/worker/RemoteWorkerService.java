package com.itman.springclou.service.register.worker;

import com.itman.springclou.entity.register.worker.WorkerFeignDTO;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "it-cloud-register",fallbackFactory = RemoteWorkerServiceFallback.class, contextId = "remoteWorkerService")
public interface RemoteWorkerService
{
    @GetMapping("findById/{id}")
    WorkerFeignDTO findById(@PathVariable("id") String id);
}
