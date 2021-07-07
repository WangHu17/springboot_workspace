package com.example.springboot_cache;

import com.example.springboot_cache.bean.Employee;
import com.example.springboot_cache.mapper.EmployeeMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;

@SpringBootTest
class SpringbootCacheApplicationTests {

    @Autowired
    EmployeeMapper employeeMapper;

    @Autowired
    StringRedisTemplate stringRedisTemplate;

    @Autowired
    RedisTemplate redisTemplate;

    @Autowired
    RedisTemplate<Object,Employee> employeeRedisTemplate;

    @Test
    void contextLoads() {
//        stringRedisTemplate.opsForValue().append("msg","wh");
//        String msg = stringRedisTemplate.opsForValue().get("msg");
//        System.out.println(msg);

        //存放对象(将数据保存为json格式，自定义RedisTemplate的序列化器)
        Employee emp = employeeMapper.getEmp(1);
//        redisTemplate.opsForValue().set("emp1",emp);
        employeeRedisTemplate.opsForValue().set("emp2",emp);
    }

}
