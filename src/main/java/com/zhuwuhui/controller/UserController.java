package com.zhuwuhui.controller;

import com.zhuwuhui.entity.ApiResponse;
import com.zhuwuhui.entity.User;
import com.zhuwuhui.enums.ApiResponseEnum;
import com.zhuwuhui.service.UserService;
import com.zhuwuhui.utils.ApiResponseUtil;
import com.zhuwuhui.utils.JwtUtil;
import com.zhuwuhui.utils.TokenAuthentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Controller
public class UserController {

    @Resource
    private UserService userService;

    @GetMapping("/getUserInfo")
    public String getUserInfo(Model model){
        model.addAttribute("user",userService.getUserInfo());
        return "user";
    }

    @PostMapping("/getusdaa")
    @ResponseBody
    public List<User> getusdaa(@RequestParam(value = "content")String content){
        List<User> list = userService.getUserInfo();
        System.out.println(content);
        return list;
    }

    /**
     * 登陆接口
     *
     * @return token
     */
    @PostMapping(value = "/loginByUser")
    @ResponseBody
    public ApiResponse loginByUser(@RequestBody Map<String,String> map) {
        String userName = map.get("userName");
        String password = map.get("password");
        //身份验证是否成功
        boolean isSuccess = userService.checkUser(userName, password);
        if (isSuccess) {
            User user = userService.getUserByLoginName(userName);
            if (user != null) {
                //返回token
                String token = TokenAuthentication.sign(user.getName(), user.getId().toString());
                if (token != null) {
                    return ApiResponseUtil.getApiResponse(token);
                }
            }
        }
        //返回登陆失败消息
        return ApiResponseUtil.getApiResponse(ApiResponseEnum.LOGIN_FAIL);
    }
}
