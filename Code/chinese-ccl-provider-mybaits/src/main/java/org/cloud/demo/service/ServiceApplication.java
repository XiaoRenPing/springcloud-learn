package org.cloud.demo.service;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
//@EnableEurekaServer //此服务即是eureka注册中心又是服务的提供者
@EnableEurekaClient
@MapperScan(basePackages="org.cloud.demo.service.dao")
public class ServiceApplication{
    public static void main( String[] args ){
        SpringApplication.run(ServiceApplication.class, args);
    }
}
