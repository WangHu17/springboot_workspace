package com.example.springboot_restful_crud.exception;

import org.springframework.stereotype.Component;

/**
 * @author wanghu
 * @discrption：
 * @create 2021-06-06 16:10
 */
public class UserNotExistException extends RuntimeException {

    public UserNotExistException(){
        super("用户不存在");
    }

}
