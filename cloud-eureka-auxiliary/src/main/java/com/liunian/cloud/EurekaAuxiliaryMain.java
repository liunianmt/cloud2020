package com.liunian.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @ProjectName: cloud2020
 * @PackageName: com.liunian.cloud
 * @ClassName: EurekaAuxiliaryMain
 * @Description: eurekaService2
 * @author: liunian
 * @date: 2020/4/25 10:53
 * @Copyright: Github Copyright (c) 2020
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaAuxiliaryMain {
    public static void main(String[] args) {
        SpringApplication.run(EurekaAuxiliaryMain.class);
    }
}
