package com.atguigu.test2;

import com.atguigu.pojo.Department;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class OneThenMoreTest {
    @Test
    public void test1() throws IOException {
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSession sqlSession = new SqlSessionFactoryBuilder().build(is).openSession();
        OneThenMoreMapper mapper = sqlSession.getMapper(OneThenMoreMapper.class);
        List<Department> list = mapper.getAllDept();
        System.out.println(list);
    }
}
