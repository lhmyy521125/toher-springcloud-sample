package cn.toher.servicerfeign.controller;

import cn.toher.servicerfeign.service.HelloFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: 同恒科技-李怀明
 * @Date: 2019/10/19 10:58
 */
@RestController
public class HelloFeignController {

    @Autowired
    private HelloFeignService helloFeignService;

    @RequestMapping("/helloFeign")
    public String helloFeign(@RequestParam(value = "name") String name){
        return helloFeignService.helloFeign(name);
    }

    @RequestMapping("/hello")
    public String hello(@RequestParam(value = "name") String name){
        return "hello Feign";
    }
}
