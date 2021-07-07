package com.example.provider_ticket.service;

import org.springframework.stereotype.Service;

/**
 * @author wanghu
 * @discrption：
 * @create 2021-06-22 16:11
 */
@Service
public class TicketService {

    public String getTicket(){
        System.out.println("8002");
       return "《电影》";
    }

}
