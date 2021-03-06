package com.zhuwuhui.service;

import com.zhuwuhui.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    List<User> getUserInfo();

    boolean checkUser(String userName, String password);

    User getUserByLoginName(String userName);
}
