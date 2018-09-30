package com.test;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName: ProducerApplication
 * @Description TODO
 * @Author: zyd
 * @Date: 2018/9/29 15:33
 * @Version: 1.0
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ProducerApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(ProducerApplication.class).web(true).run(args);
    }
}
