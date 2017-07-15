package cn.winner.service2;

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
public class ServiceApp2 {
    private static final Logger logger = LoggerFactory.getLogger(ServiceApp2.class);

    @RequestMapping("/home")
    public String home(){
        logger.info("visitor home controller in service2");
        return "service2-home-Ok!";
    }

    public static void main(String[] args) {
        SpringApplication.run(ServiceApp2.class);
    }
}
