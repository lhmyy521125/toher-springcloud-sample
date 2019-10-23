package cn.toher.serviceribbon.controller;

import cn.toher.serviceribbon.service.HelloRibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: 同恒科技-李怀明
 * @Date: 2019/10/19 10:58
 */
@RestController
public class HelloRibbonController {

    @Autowired
    private HelloRibbonService helloRibbonService;

    @RequestMapping("/helloRibbon")
    public String helloRibbon(String name){
        return helloRibbonService.helloRibbon(name);
    }
}
