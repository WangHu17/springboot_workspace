package com.example.consumer_user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author wanghu
 * @discrption：
 * @create 2021-06-22 17:27
 */
@RestController
public class ConsumerController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/buy")
    public String buy(String name){
        String s = restTemplate.getForObject("http://192.168.0.105:8001//ticket", String.class);
        return name + "购买了：" + s;
    }

}
