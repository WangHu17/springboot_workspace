package com.example.rabbitmq;

import com.example.rabbitmq.bean.Book;
import org.junit.jupiter.api.Test;
import org.springframework.amqp.core.AmqpAdmin;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;

@SpringBootTest
class SpringbootRabbitmqApplicationTests {

    @Autowired
    RabbitTemplate rabbitTemplate;

    @Autowired
    AmqpAdmin amqpAdmin;

    @Test
    public void amqpAdminTest(){
        //创建交换器
//        amqpAdmin.declareExchange(new DirectExchange("amqpAdmin.exchange"));
        //创建队列
//        amqpAdmin.declareQueue(new Queue("amqpAdmin.queue",true));
        //绑定交换器和队列
        amqpAdmin.declareBinding(new Binding("amqpAdmin.queue",Binding.DestinationType.QUEUE,"amqpAdmin.exchange","amqp.wanghu",null));
//        amqpAdmin.deleteExchange();
//        amqpAdmin.removeBinding();
    }

    @Test
    void contextLoads() {
        HashMap<String, String> map = new HashMap<>();
        map.put("name","wanghu");
        map.put("age","22");
//        rabbitTemplate.convertAndSend("exchange.direct","wanghu.emps",map);
//        Object o = rabbitTemplate.receiveAndConvert("wanghu.emps");
//        System.out.println(o.getClass());
//        System.out.println(o);
        rabbitTemplate.convertAndSend("exchange.fanout","",new Book("三体","刘慈欣"));
    }

}
