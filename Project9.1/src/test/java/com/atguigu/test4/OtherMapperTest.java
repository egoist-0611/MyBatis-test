package com.atguigu.test4;

import com.atguigu.mapper.test4.OtherMapper;
import com.atguigu.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class OtherMapperTest {
    @Test
    public void test4() throws IOException {
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSession sqlSession = new SqlSessionFactoryBuilder().build(is).openSession(true);
        OtherMapper mapper = sqlSession.getMapper(OtherMapper.class);
//        int key = 0;
//        User user = mapper.getNewUserKey("July", 19, '女', "19283928432", key);
//        System.out.println(key);
        User user = new User(null, "July", 19, '女', "19283928432");
        mapper.getNewUserKey(user);
        System.out.println(user);
    }

    @Test
    public void test3() throws IOException {
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSession sqlSession = new SqlSessionFactoryBuilder().build(is).openSession();
        OtherMapper mapper = sqlSession.getMapper(OtherMapper.class);
        User user = mapper.getUserFromTable("user");
        System.out.println(user);
    }

    @Test
    public void test2() throws IOException {
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSession sqlSession = new SqlSessionFactoryBuilder().build(is).openSession(true);
        OtherMapper mapper = sqlSession.getMapper(OtherMapper.class);
        mapper.deleteUsers("1,5");
    }

    @Test
    public void test1() throws IOException {
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSession sqlSession = new SqlSessionFactoryBuilder().build(is).openSession();
        OtherMapper mapper = sqlSession.getMapper(OtherMapper.class);
        User user = mapper.getUserByLikeName("A");
        System.out.println(user);
    }
}
