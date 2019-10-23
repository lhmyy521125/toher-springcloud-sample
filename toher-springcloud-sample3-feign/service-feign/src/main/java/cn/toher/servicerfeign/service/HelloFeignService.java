package cn.toher.servicerfeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author: 同恒科技-李怀明
 * @Date: 2019/10/19 15:26
 */

@FeignClient(value = "SERVICE-HELLO")
public interface HelloFeignService {
    @RequestMapping(value = "/hello")
    String helloFeign(@RequestParam(value = "name") String name);
}
