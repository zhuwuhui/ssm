package com.zhuwuhui.controller;

import com.zhuwuhui.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping("/getUserInfo")
    public String getUserInfo(Model model){
        model.addAttribute("user",userService.getUserInfo());
        return "user";
    }
}
