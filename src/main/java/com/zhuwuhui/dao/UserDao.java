package com.zhuwuhui.dao;

import com.zhuwuhui.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserDao {

    List<User> getUserInfo();
}
