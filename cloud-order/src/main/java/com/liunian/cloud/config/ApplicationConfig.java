package com.liunian.cloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @ProjectName: cloud2020
 * @PackageName: com.liunian.cloud.config
 * @ClassName: ApplicationConfig
 * @Description: 配置类
 * @author: liunian
 * @date: 2020/4/18 20:59
 * @Copyright: Github Copyright (c) 2020
 */
@Configuration
public class ApplicationConfig {

    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
