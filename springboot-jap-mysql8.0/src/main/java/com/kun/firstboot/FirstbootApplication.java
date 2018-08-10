package com.kun.firstboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
@RequestMapping("/hello")
public class FirstbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(FirstbootApplication.class, args);
    }

    @RequestMapping(value = {"/say/{id}"}, method= RequestMethod.GET)
    public String say(@PathVariable("id") Integer id) {
        return  "id:" + id  ;
    }
}
