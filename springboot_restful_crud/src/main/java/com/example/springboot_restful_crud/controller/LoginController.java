package com.example.springboot_restful_crud.controller;

import com.example.springboot_restful_crud.exception.UserNotExistException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * @author wanghu
 * @discrption：
 * @create 2021-06-02 16:58
 */
@Controller
public class LoginController {

    @PostMapping("/user/login")
    public String login(@RequestParam("username")String username,
                        @RequestParam("password")String password,
                        Map<String,Object> map,
                        HttpSession session){
        if(!StringUtils.isEmpty(username) && "123".equals(password)){
            session.setAttribute("username",username);
            return "redirect:/main.html";
        }else {
            map.put("msg","用户名或密码错误");
            return "login";
        }
    }

    @ResponseBody
    @RequestMapping("/login")
    public String UserExist(@RequestParam("user")String user){
        if(user.equals("aaa")){
            throw new UserNotExistException();
        }
        return "success";
    }

}
