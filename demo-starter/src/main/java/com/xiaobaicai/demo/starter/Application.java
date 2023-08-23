package com.xiaobaicai.demo.starter;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author caijy
 * @description 启动类
 * @date 2023/8/20 星期日 4:06 下午
 */

@SpringBootApplication
@ComponentScan(basePackages = {"com.xiaobaicai.demo","com.xiaobaicai.framework"})
@MapperScan(basePackages = "com.xiaobaicai.demo.infrastructure.mapper")
public class Application extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(Application.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
