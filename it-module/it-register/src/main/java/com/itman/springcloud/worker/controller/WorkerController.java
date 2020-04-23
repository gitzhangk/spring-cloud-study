package com.itman.springcloud.worker.controller;

import com.alibaba.fastjson.JSON;
import com.itman.springcloud.worker.entity.Worker;
import com.itman.springcloud.worker.service.WorkerService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangke
 * @date 2020/4/21 22:50
 **/
@RestController
@RequestMapping("worker")
@AllArgsConstructor
public class WorkerController
{
    private final WorkerService workerService;

    @GetMapping("/findById/{id}")
    public String findById(@PathVariable("id") String id)
    {
        Worker worker = workerService.findById(id);
       return JSON.toJSONString(worker);
    }
}
