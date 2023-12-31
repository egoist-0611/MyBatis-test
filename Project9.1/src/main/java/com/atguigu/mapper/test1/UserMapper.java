package com.atguigu.mapper.test1;

import com.atguigu.pojo.User;

import java.util.List;

public interface UserMapper {
    public abstract int insertUser();

    public abstract void deleteUser();

    int updateUser();

    User getUserById();

    List<User> getAllUsers();
}
