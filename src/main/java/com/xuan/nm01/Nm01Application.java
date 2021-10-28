package com.xuan.nm01;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.xuan.nm01.mapper")
public class Nm01Application {

    public static void main(String[] args) {
        SpringApplication.run(Nm01Application.class, args);
    }

}
