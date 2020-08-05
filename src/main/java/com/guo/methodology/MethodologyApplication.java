package com.guo.methodology;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.guo.methodology.dao") // mybatis 扫描dao接口
@SpringBootApplication
public class MethodologyApplication {

    public static void main(String[] args) {
        SpringApplication.run(MethodologyApplication.class, args);
    }

}
