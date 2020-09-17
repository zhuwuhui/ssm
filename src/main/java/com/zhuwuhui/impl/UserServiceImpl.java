package com.zhuwuhui.impl;

import com.zhuwuhui.dao.UserDao;
import com.zhuwuhui.entity.User;
import com.zhuwuhui.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    @Override
    public List<User> getUserInfo() {
        return userDao.getUserInfo();
    }

    @Override
    public boolean checkUser(String userName, String password) {
        return userDao.checkUser(userName,password);
    }

    @Override
    public User getUserByLoginName(String userName){
        return userDao.getUserByLoginName(userName);
    }
}
