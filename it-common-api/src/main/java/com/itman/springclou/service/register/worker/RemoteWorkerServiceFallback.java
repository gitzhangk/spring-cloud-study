package com.itman.springclou.service.register.worker;

import com.itman.springclou.entity.register.worker.WorkerFeignDTO;
import feign.hystrix.FallbackFactory;

/**
 * @author zhangke
 * @date 2020/4/23 12:08
 **/
public class RemoteWorkerServiceFallback implements FallbackFactory<RemoteWorkerService>
{

    @Override
    public RemoteWorkerService create(Throwable throwable)
    {
        return new RemoteWorkerService()
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
