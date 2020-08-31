package com.zhuwuhui.utils;

import com.zhuwuhui.entity.User;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        List<User> list = new ArrayList<>();
        User user1 = new User();
        User user2 = new User();
        User user3 = new User();
        list.add(user1);
        list.add(user2);
        list.add(user3);
        user1.setName("小福贵");
        user2.setName("小四喜");
        user3.setName("小月白");
        list.forEach(user -> System.out.println(user.getName()));
    }
}
