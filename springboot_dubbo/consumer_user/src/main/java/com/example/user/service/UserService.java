package com.example.user.service;

import com.example.ticket.service.TicketService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author wanghu
 * @discrption：
 * @create 2021-06-21 20:23
 */
@Service
public class UserService {

    @DubboReference
    TicketService ticketService;

    public void buyTicket(){
        String s = ticketService.saleService();
        System.out.println("买到票了："+ s);
    }

}
