package com.wetwo.weshare;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.wetwo.weshare.mapper")
public class WeshareApplication {

    public static void main(String[] args) {
        SpringApplication.run(WeshareApplication.class, args);
    }
}
