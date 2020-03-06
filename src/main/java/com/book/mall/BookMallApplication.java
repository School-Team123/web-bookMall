package com.book.mall;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.Book.mall.dao") //添加 @Mapper 注解
public class BookMallApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookMallApplication.class, args);
    }

}
