package com.atguigu.test1;

import com.atguigu.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class InsertTest {
    @Test
    public void test1() throws IOException {
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSession sqlSession = new SqlSessionFactoryBuilder().build(is).openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int res = mapper.insertUser();
        sqlSession.commit();
        System.out.println(res);
        sqlSession.close();
    }
}
