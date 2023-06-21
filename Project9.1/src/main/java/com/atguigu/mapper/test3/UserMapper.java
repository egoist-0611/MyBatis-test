package com.atguigu.mapper.test3;

import com.atguigu.pojo.User;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    Integer getUserCount();
    @MapKey("id")
    Map<String,Map<String,Object>> getAllUserOnMapMap();
    List<Map<String,Object>> getAllUserOnListMap();
    List<User> getAllUserOnListPojo();
    Map<String, Object> getUserByIdOnMap(@Param("id") Integer id);
    List<User> getUserByIdOnList(@Param("id") Integer id);
    User getUserByIdOnPojo(@Param("id") Integer id);
}
