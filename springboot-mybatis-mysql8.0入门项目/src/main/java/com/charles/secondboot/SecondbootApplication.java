package com.charles.secondboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
@RequestMapping("/hello")
public class SecondbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(SecondbootApplication.class, args);
    }
    @GetMapping("/word")
    public String say() {
        return "hello world";
    }
}
