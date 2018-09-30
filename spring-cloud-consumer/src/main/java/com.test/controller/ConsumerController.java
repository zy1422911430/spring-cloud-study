package com.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName: ConsumerController
 * @Description TODO
 * @Author: zyd
 * @Date: 2018/9/29 17:38
 * @Version: 1.0
 */
@RestController
public class ConsumerController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/testConsumer",method = RequestMethod.GET)
    public String testConsumer(){
        return restTemplate.getForEntity("http://producer-service/getMsg",String.class).getBody();
    }
}
