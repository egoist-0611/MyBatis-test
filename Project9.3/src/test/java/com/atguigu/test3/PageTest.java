package com.atguigu.test3;

import com.atguigu.mapper.EmployeeMapper;
import com.atguigu.pojo.Employee;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.jdbc.SQL;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class PageTest {
    @Test
    public void test1() throws IOException {
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSession sqlSession = new SqlSessionFactoryBuilder().build(is).openSession();
        EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
//        Page<Object> objects = PageHelper.startPage(2, 4);
        Page<Object> objects = PageHelper.startPage(3, 4);
        List<Employee> employees = mapper.selectByExample(null);
        PageInfo<Employee> pageInfo = new PageInfo<>(employees, 5);
        for (Employee employee : employees) {
            System.out.println(employee);
        }
        System.out.println(objects);
        System.out.println(pageInfo);
    }
}
