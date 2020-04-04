package com.atguigu.mall.user;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;


@SpringBootApplication
@MapperScan(basePackages = "com.atguigu.mall.user.mapper")
public class GmalUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(GmalUserApplication.class, args);
    }

}
