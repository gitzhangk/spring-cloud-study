package com.itman.springcloud.reg.worker.service.impl;

import com.itman.springcloud.reg.worker.entity.Worker;
import com.itman.springcloud.reg.worker.service.WorkerService;
import org.springframework.stereotype.Service;

/**
 * @author zhangke
 * @date 2020/4/21 22:52
 **/
@Service
public class WorkerServiceImpl implements WorkerService
{
    @Override
    public Worker findById(String id)
    {
        Worker worker = Worker.builder().id(id).name("张三").mobile("15714253425").build();
        return worker;
    }
}
