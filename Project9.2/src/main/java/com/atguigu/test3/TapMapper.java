package com.atguigu.test3;

import com.atguigu.pojo.Employee;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TapMapper {
    List<Employee> getEmpByNameAge(@Param("empName")String name,@Param("age")Integer age);

    void deleteMoreByArray(@Param("eids")Integer[] eids);

    void insertMoreByList(@Param("emps")List<Employee> emps);

    List<Employee> getAllEmployee();
}
