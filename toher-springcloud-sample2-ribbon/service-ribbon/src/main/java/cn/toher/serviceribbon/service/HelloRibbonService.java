package cn.toher.serviceribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: 同恒科技-李怀明
 * @Date: 2019/10/19 10:54
 */
@Service
public class HelloRibbonService {

    @Autowired
    private RestTemplate restTemplate;

    public String helloRibbon(String name) {
        return restTemplate.getForObject("http://SERVICE-HELLO/hello?name=" + name, String.class);
    }
}

