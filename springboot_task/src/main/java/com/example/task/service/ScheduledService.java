package com.example.task.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * @author wanghu
 * @discrption：
 * @create 2021-06-20 17:59
 */
@Service
public class ScheduledService {

    /**
     *  秒、分、时、日、月、周几
     */
//    @Scheduled(cron = "* * * * * *")
    @Scheduled(cron = "0 5 * ? * 7")
    public void hello(){
        System.out.println("hello...");
    }

}
