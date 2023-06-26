package com.atguigu.test1;

import com.atguigu.mapper.EmployeeMapper;
import com.atguigu.pojo.Employee;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class SimpleTest {
//    @Test
//    public void test1() throws IOException {
//        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
//        SqlSession sqlSession = new SqlSessionFactoryBuilder().build(is).openSession();
//        EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
//        List<Employee> employees = mapper.selectAll();
//        System.out.println(employees);
//    }
}
