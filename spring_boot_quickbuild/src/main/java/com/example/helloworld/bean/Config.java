package com.example.helloworld.bean;

import com.example.helloworld.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author wanghu
 * @discrption：
 * @create 2021-05-20 15:00
 */
@Configuration
public class Config {

    @Bean
    public HelloService helloService(){
        return new HelloService();
    }

}
