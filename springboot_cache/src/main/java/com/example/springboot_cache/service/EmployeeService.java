package com.example.springboot_cache.service;

import com.example.springboot_cache.bean.Employee;
import com.example.springboot_cache.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * @author wanghu
 * @discrption：
 * @create 2021-06-17 16:43
 */
@CacheConfig(cacheNames = "emp")
@Service
public class EmployeeService {

    @Autowired
    EmployeeMapper employeeMapper;

    //key,condition,unless,keyGenerator
    @Cacheable(cacheNames = {"emp"})
    public Employee getEmp(Integer id){
        System.out.println("查询"+id);
        return employeeMapper.getEmp(id);
    }

    @CachePut(key = "#employee.id")
    public Employee updateEmp(Employee employee){
        System.out.println("更新"+employee.getId());
        employeeMapper.updateEmp(employee);
        return employee;
    }

    /**
     * allEntries = true：指定清除这个缓存中所有的数据
     * beforeInvocation = false: 缓存的清除是否在方法之前执行
     * @param id
     */
    @CacheEvict(value = "emp")
    public void delEmp(Integer id){
        System.out.println("删除"+id);
        employeeMapper.deleteEmp(id);
    }

    public void addEmp(Employee employee){
        employeeMapper.insertEmp(employee);
    }

}
