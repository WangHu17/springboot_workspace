package com.example.provider_ticket.controller;

import com.example.provider_ticket.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wanghu
 * @discrption：
 * @create 2021-06-22 16:13
 */
@RestController
public class TicketController {

    @Autowired
    TicketService ticketService;

    @GetMapping("/ticket")
    public String ticket(){
        return ticketService.getTicket();
    }

}
