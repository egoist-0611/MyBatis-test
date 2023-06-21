package com.atguigu.mapper.test2;

import com.atguigu.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.Map;

public interface UserMapper {
    User getUserById(Integer id);

    User getUserByNameAge(String name,Integer age);

    User getUserByMap(Map<String,Object> map);

    User getUserByAnnotation(@Param("name")String name,@Param("age")Integer age);

    void insertUser(User user);
}
