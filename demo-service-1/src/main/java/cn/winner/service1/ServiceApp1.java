package cn.winner.service1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by xuebj on 2017/1/3.
 */
@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class ServiceApp1 {
    private static final Logger logger = LoggerFactory.getLogger(ServiceApp1.class);

    @RequestMapping("/home")
    public String home(){
        logger.info("visitor home controller in service1");
        return "service1-home-Ok!";
    }

    public static void main(String[] args) {
        SpringApplication.run(ServiceApp1.class);
    }
}
