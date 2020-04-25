package cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ProjectName: cloud2020
 * @PackageName: com.liunian.cloud
 * @ClassName: PayMain
 * @Description: pay模块 启动类
 * @author: liunian
 * @date: 2020/3/14 22:34
 * @Copyright: GitHub Copyright (c) 2020
 */
@SpringBootApplication
@EnableEurekaClient
public class PayAuxiliaryMain {

    public static void main(String[] args) {
        SpringApplication.run(PayAuxiliaryMain.class, args);
    }
}
