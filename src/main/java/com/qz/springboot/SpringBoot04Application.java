package com.qz.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.qz.springboot.mapper")
public class SpringBoot04Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot04Application.class, args);
    }

}
