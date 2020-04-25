package com.liunian.cloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ProjectName: cloud2020
 * @PackageName: com.liunian.cloud.controller
 * @ClassName: PayController
 * @Description: 支付demo
 * @author: liunian
 * @date: 2020/4/18 19:02
 * @Copyright: GitHub Copyright (c) 2020
 */
@RestController
@RequestMapping(value = "pay")
@Slf4j
public class PayController {

    @Resource
    private DiscoveryClient discoveryClient;

    @Value("${server.port}")
    private String port;

    @GetMapping(value = "get/{id}")
    public String getPayById(@PathVariable("id") String id) {
        log.info("<<<<<<<<<<<<<<<<<getPayById:" + id);
        String msg = "[pay/get/" + id + "] 端口:" + port + ", 访问success";
        return msg;
    }

    @GetMapping(value = "/discovery")
    public Object discovery() {

        List<String> services = discoveryClient.getServices();
        services.forEach(x -> log.info(">>>>>>>>" + x ));


        List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PAY-SERVICE");
        instances.forEach(x -> log.info(x.getServiceId() + ":" + x.getHost() + ";" + x.getPort() + ";" + x.getUri()));

        return this.discoveryClient;

    }
}
