package com.test.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: ProducerController
 * @Description TODO
 * @Author: zyd
 * @Date: 2018/9/29 15:34
 * @Version: 1.0
 */
@RestController
public class ProducerController {

    private static final Logger LOGGER = LoggerFactory.getLogger(ProducerController.class);

    @Autowired
    private DiscoveryClient client;

    @RequestMapping(value = "/getMsg",method = RequestMethod.GET)
    public String getMsg(){
        ServiceInstance localServiceInstance = client.getLocalServiceInstance();
        LOGGER.info("getMsg: host="+localServiceInstance.getHost()+",service_id="+localServiceInstance.getServiceId());
        return "test";
    }

}
