package com.xiaobaicai.demo.infrastructure;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author caijy
 * @description TODO
 * @date 2023/8/20 星期日 4:06 下午
 */

@SpringBootApplication
@ComponentScan(basePackages = {"com.xiaobaicai","com.xiaobaicai.framework"})
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
