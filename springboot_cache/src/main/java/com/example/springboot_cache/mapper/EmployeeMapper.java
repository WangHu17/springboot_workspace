package com.example.springboot_cache.mapper;

import com.example.springboot_cache.bean.Employee;
import org.apache.ibatis.annotations.*;

/**
 * @author wanghu
 * @discrption：
 * @create 2021-06-17 16:33
 */
@Mapper
public interface EmployeeMapper {

    @Select("select * from employee where id = #{id}")
    public Employee getEmp(Integer id);

    @Delete("delete from employee where id = #{id}")
    public void deleteEmp(Integer id);

    @Update("update employee set lastName=#{lastName},email=#{email},gender=#{gender},d_id=#{dId}")
    public void updateEmp(Employee employee);

    @Insert("insert into employee(lastName,email,gender,d_id) values(#{latName},#{email},#{gender},#{dId})")
    public void insertEmp(Employee employee);

}
