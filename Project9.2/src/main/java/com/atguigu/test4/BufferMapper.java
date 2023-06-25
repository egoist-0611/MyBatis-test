package com.atguigu.test4;

import com.atguigu.pojo.Employee;

import java.util.List;

public interface BufferMapper {
    List<Employee> getAllEmployee();
    void insertEmployee(Employee emp);
}
