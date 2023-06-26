package com.atguigu.test2;

import com.atguigu.mapper.EmployeeMapper;
import com.atguigu.pojo.Employee;
import com.atguigu.pojo.EmployeeExample;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class AllTest {
    @Test
    public void test1() throws IOException {
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSession sqlSession = new SqlSessionFactoryBuilder().build(is).openSession(true);
        EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
//        mapper.updateByPrimaryKey(new Employee(1,"Type",18,null,"12928392839",null));
//        mapper.updateByPrimaryKeySelective(new Employee(1,"Type",18,null,"12928392839",null));

//        EmployeeExample employeeExample = new EmployeeExample();
//        employeeExample.createCriteria().andEmpNameEqualTo("June").andAgeEqualTo(19);
//        employeeExample.or().andEmpNameEqualTo("July").andAgeEqualTo(19);
//        List<Employee> employees = mapper.selectByExample(employeeExample);
//        List<Employee> employees = mapper.selectByExample(null);
//        System.out.println(employees);
    }
}
