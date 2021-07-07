package com.example.ticket.service;

import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Service;

/**
 * @author wanghu
 * @discrption：
 * @create 2021-06-21 20:06
 */
@Service
@DubboService
public class TicketServiceImpl implements TicketService{
    @Override
    public String saleService() {
        return "《电影》";
    }
}
