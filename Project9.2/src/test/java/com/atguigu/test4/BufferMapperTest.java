package com.atguigu.test4;

import com.atguigu.pojo.Employee;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class BufferMapperTest {
    @Test
    public void test1() throws IOException {
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession = factory.openSession();
        BufferMapper mapper1 = sqlSession.getMapper(BufferMapper.class);
        BufferMapper mapper = sqlSession.getMapper(BufferMapper.class);
        BufferMapper mapper2 = sqlSession.getMapper(BufferMapper.class);
        System.out.println(mapper1.getAllEmployee());
        mapper.insertEmployee(new Employee(null,"aaa",null,null,null));
        System.out.println(mapper2.getAllEmployee());
//        SqlSession sqlSession1 = factory.openSession();
//        BufferMapper mapper = sqlSession1.getMapper(BufferMapper.class);
//        System.out.println(mapper.getAllEmployee());

    }
}
