package com.liunian.cloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @ProjectName: cloud2020
 * @PackageName: com.liunian.cloud
 * @ClassName: OrderController
 * @Description: 订单demo
 * @author: liunian
 * @date: 2020/4/18 20:56
 * @Copyright: Github Copyright (c) 2020
 */
@RestController
@RequestMapping(value = "order")
@Slf4j
public class OrderController {

    public static final String BASE_URL = "http://localhost:8001/";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping(value = "get/{id}")
    private String getPayById(@PathVariable("id") String id) {
        log.info("[order/get/" + id );
        return "[order/get]----调用--->>>>" + restTemplate.getForObject(BASE_URL + "pay/get/" +id, String.class);
    }
}
