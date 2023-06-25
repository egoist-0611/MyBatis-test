package com.atguigu.test2;

import com.atguigu.pojo.Department;
import com.atguigu.pojo.Employee;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OneThenMoreMapper {
    List<Department> getAllDept();

    List<Employee> getEmployeeByDid(@Param("did")Integer did);
}
