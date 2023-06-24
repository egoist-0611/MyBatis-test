package com.atguigu.mapper.test4;

import com.atguigu.pojo.User;
import org.apache.ibatis.annotations.Param;

public interface OtherMapper {
    void getNewUserKey(User user);

    //    User getNewUserKey(@Param("name") String name,@Param("age")Integer age,@Param("sex")Character sex,@Param("phone")String phone,@Param("key")Integer key);
    User getUserFromTable(@Param("table") String table);

    void deleteUsers(@Param("ids") String ids);

    User getUserByLikeName(@Param("name") String name);
}
