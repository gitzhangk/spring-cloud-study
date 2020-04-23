package com.itman.springcloud.worker.service;

import com.itman.springcloud.worker.entity.Worker;

public interface WorkerService
{
    /**
     * 根据id获取工人信息
     * @athor zhangke
     * @date 2020/4/21 23:08
     * @param id 工人id
     * @return Worker
     **/
    Worker findById(String id);
}
