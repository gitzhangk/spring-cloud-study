package com.itman.springcloud.worker.entity;

import jdk.jfr.DataAmount;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author zhangke
 * @date 2020/4/21 22:53
 **/
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Worker
{
    private String id;
    private String name;
    private String mobile;
    private String sex;
}
