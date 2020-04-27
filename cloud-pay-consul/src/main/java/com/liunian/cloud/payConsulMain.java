package com.liunian.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ProjectName: cloud2020
 * @PackageName: com.liunian.cloud
 * @ClassName: payConsulMain
 * @Description: consul 提供端
 * @author: liunian
 * @date: 2020/4/27 22:00
 * @Copyright: Github Copyright (c) 2020
 */
@SpringBootApplication
@EnableDiscoveryClient
public class payConsulMain {
    public static void main(String[] args) {
        SpringApplication.run(payConsulMain.class);
    }
}
