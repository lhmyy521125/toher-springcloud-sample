package cn.toher.servicerfeign.service;

import org.springframework.stereotype.Component;

/**
 * @Author: 同恒科技-李怀明
 * @Date: 2019/10/21 10:09
 */

@Component
public class HelloFeignServiceHystric implements HelloFeignService {

    @Override
    public String helloFeign(String name) {
        return "hi, "+name+" sorry,this is feign hystrix  error";
    }
}
