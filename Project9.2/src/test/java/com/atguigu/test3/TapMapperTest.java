package com.atguigu.test3;

import com.atguigu.pojo.Employee;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TapMapperTest {
    @Test
    public void test4() throws IOException {
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSession sqlSession = new SqlSessionFactoryBuilder().build(is).openSession();
        TapMapper mapper = sqlSession.getMapper(TapMapper.class);
        List<Employee> emps = mapper.getAllEmployee();
        System.out.println(emps);
    }
    @Test
    public void test3() throws IOException {
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSession sqlSession = new SqlSessionFactoryBuilder().build(is).openSession(true);
        TapMapper mapper = sqlSession.getMapper(TapMapper.class);
        ArrayList<Employee> employees = new ArrayList<>();
        Employee emp1 = new Employee(null, "Tom", 10, '男', "19283728372");
        Employee emp2 = new Employee(null, "Mike", 12, '男', "19234228372");
        Employee emp3 = new Employee(null, "Petter", 19, '男', "19283213453");
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        mapper.insertMoreByList(employees);
    }
    @Test
    public void test2() throws IOException {
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSession sqlSession = new SqlSessionFactoryBuilder().build(is).openSession(true);
        TapMapper mapper = sqlSession.getMapper(TapMapper.class);
        mapper.deleteMoreByArray(new Integer[]{7,8});
    }
    @Test
    public void test1() throws IOException {
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSession sqlSession = new SqlSessionFactoryBuilder().build(is).openSession();
        TapMapper mapper = sqlSession.getMapper(TapMapper.class);
        List<Employee> emps = mapper.getEmpByNameAge("June", 29);
//        List<Employee> emps = mapper.getEmpByNameAge(null, 29);
//        List<Employee> emps = mapper.getEmpByNameAge(null, null);
        System.out.println(emps);
    }
}
