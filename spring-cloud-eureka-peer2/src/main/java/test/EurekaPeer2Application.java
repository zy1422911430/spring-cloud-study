package com.test;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @ClassName: com.test.EurekaServerApplication
 * @Description TODO
 * @Author: zyd
 * @Date: 2018/9/29 15:03
 * @Version: 1.0
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaPeer2Application {

    public static void main(String[] args) {
        new SpringApplicationBuilder(EurekaPeer2Application.class).web(true).run(args);
    }
}
