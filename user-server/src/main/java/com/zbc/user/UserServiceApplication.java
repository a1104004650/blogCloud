package com.zbc.user;

import com.zbc.feign.client.PointClient;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@MapperScan("com.zbc.user.mapper") //扫描的mapper
@SpringBootApplication
@EnableFeignClients(clients = {PointClient.class})
public class UserServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserServiceApplication.class, args);
    }
}
