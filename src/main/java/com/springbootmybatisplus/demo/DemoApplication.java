package com.springbootmybatisplus.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@MapperScan("com.springbootmybatisplus.demo.mapper")
@EnableSwagger2
public class DemoApplication {

    public static void main( String[] args ) {
        SpringApplication.run( DemoApplication.class, args );
    }

}