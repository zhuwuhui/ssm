package com.zhuwuhui.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author zhuwuhui
 */
@Controller
public class TestController {

    /**
     *猪无悔测试
     * */
    @RequestMapping("/login")
    public String login(){
        return "login";
    }
}
