package cn.toher.webhystrixdashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard //开启Hystrix Dashboard
public class WebHystrixDashboardApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebHystrixDashboardApplication.class, args);
    }

}
