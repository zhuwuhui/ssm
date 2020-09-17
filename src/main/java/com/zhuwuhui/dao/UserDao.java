package com.zhuwuhui.dao;

import com.zhuwuhui.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserDao {

    List<User> getUserInfo();

    boolean checkUser(@Param("userName") String userName, @Param("password") String password);

    User getUserByLoginName(@Param("userName") String userName);
}
