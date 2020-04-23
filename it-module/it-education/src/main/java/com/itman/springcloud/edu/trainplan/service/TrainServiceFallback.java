package com.itman.springcloud.edu.trainplan.service;

import com.itman.springclou.entity.register.worker.WorkerFeignDTO;
import feign.hystrix.FallbackFactory;

/**
 * @author zhangke
 * @date 2020/4/23 17:44
 **/
public class TrainServiceFallback implements FallbackFactory<TrainServiceFeign>
{
    @Override
    public TrainServiceFeign create(Throwable throwable)
    {
        return new TrainServiceFeign()
        {
            @Override
            public WorkerFeignDTO findById(String id)
            {
                throwable.printStackTrace();
                return null;
            }
        };
    }
}
