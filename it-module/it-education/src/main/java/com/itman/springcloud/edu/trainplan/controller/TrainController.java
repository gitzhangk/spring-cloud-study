package com.itman.springcloud.edu.trainplan.controller;

import com.itman.springclou.entity.register.worker.WorkerFeignDTO;
import com.itman.springclou.service.register.worker.RemoteWorkerService;
import com.itman.springcloud.edu.trainplan.service.TrainServiceFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author zhangke
 * @date 2020/4/21 22:42
 **/
@RestController
@RequestMapping("train")
public class TrainController
{
    @Autowired
    private  RestTemplate restTemplate;

    @Autowired
    private TrainServiceFeign trainServiceFeign;

    @GetMapping("/detail/{id}")
    public WorkerFeignDTO findWorkerByIdOfFeign(@PathVariable("id")String id)
    {
        return trainServiceFeign.findById(id);
    }

    @GetMapping("/findWorkerById/{id}")
    public WorkerFeignDTO findWorkerByIdOfRest(@PathVariable("id") String id)
    {
        return restTemplate.getForObject("http://127.0.0.1:8010/worker/findById/"+id,WorkerFeignDTO.class);
    }
}
