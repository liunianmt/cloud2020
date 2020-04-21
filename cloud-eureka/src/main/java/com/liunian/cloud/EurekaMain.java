package com.liunian.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @ProjectName: cloud2020
 * @PackageName: com.liunian.cloud
 * @ClassName: eurekaMain
 * @Description: Eureka 服务端
 * @author: liunian
 * @date: 2020/4/21 22:45
 * @Copyright: Github Copyright (c) 2020
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaMain {
    public static void main(String[] args) {
        SpringApplication.run(EurekaMain.class);
    }
}
