package com.example.spring_boot_jsp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author wanghu
 * @discrption：
 * @create 2021-06-08 14:32
 */
@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String hello(Model model){
        model.addAttribute("msg","nihao");
        return "success";
    }

}
