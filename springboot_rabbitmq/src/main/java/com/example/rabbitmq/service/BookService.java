package com.example.rabbitmq.service;

import com.example.rabbitmq.bean.Book;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

/**
 * @author wanghu
 * @discrption：
 * @create 2021-06-19 20:12
 */
@Service
public class BookService {

    @RabbitListener(queues = "wanghu.emps")
    public void book(Book book){
        System.out.println("收到消息："+book);
    }

}
