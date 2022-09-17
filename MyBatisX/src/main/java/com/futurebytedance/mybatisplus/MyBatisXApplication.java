package com.futurebytedance.mybatisplus;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.futurebytedance.mybatisplus.mapper")
public class MyBatisXApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyBatisXApplication.class, args);
    }

}
