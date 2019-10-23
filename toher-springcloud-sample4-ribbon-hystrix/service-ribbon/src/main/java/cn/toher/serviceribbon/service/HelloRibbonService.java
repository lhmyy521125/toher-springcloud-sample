package cn.toher.serviceribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
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

    //@HystrixCommand 指明该方法开启熔断，并指定了fallbackMethod熔断方法 helloError
    @HystrixCommand(fallbackMethod = "helloError" )
    public String helloRibbon(String name) {
        return restTemplate.getForObject("http://SERVICE-HELLO/hello?name=" + name, String.class);
    }

    public String helloError(String name) {
        return "hi, "+name+" sorry,this is ribbon hystrix  error";
    }

}

