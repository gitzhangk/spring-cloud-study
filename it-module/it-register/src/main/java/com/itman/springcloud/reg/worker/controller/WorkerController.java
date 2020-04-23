package com.itman.springcloud.reg.worker.controller;

import cn.hutool.core.bean.BeanUtil;
import com.alibaba.fastjson.JSON;
import com.itman.springclou.entity.register.worker.WorkerFeignDTO;
import com.itman.springcloud.reg.worker.entity.Worker;
import com.itman.springcloud.reg.worker.service.WorkerService;
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
    public WorkerFeignDTO findById(@PathVariable("id") String id)
    {
        Worker worker = workerService.findById(id);
        WorkerFeignDTO workerFeign = new WorkerFeignDTO();
        BeanUtil.copyProperties(worker,workerFeign);
       return workerFeign;
    }
}
