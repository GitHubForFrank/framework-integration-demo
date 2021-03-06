package com.zmz;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.ComponentScan;

/**
 * Refer : https://blog.csdn.net/jimo_lonely/article/details/106006432
 *
 * swagger-ui 页面 : http://localhost:10190/zuul/swagger-ui.html
 * 进入eureka注册中心查看服务 : http://localhost:10190/
 *
 * @author ASNPHDG
 * @create 2020-01-26 21:31
 */
@Slf4j
@EnableZuulProxy
@ComponentScan(basePackages = {"com.zmz"})
@SpringBootApplication
public class SpringCloudZuulApplication {

    public static void main(String[] args) {
        log.debug("Application.main.begin");
        SpringApplication.run(SpringCloudZuulApplication.class, args);
        log.info("Application.main.completed");
    }

}

