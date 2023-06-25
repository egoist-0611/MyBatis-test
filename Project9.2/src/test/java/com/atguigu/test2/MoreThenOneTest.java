package com.atguigu.test2;

import com.atguigu.pojo.Employee;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MoreThenOneTest {
    @Test
    public void test1() throws IOException {
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSession sqlSession = new SqlSessionFactoryBuilder().build(is).openSession();
        MoreThenOneMapper mapper = sqlSession.getMapper(MoreThenOneMapper.class);
        List<Employee> emps = mapper.getAllEmp();
//        System.out.println(emps);
        System.out.println(emps.get(1).getEmpName());
        System.out.println(emps.get(1).getDept());
    }
}
