package com.book.mall.controller;

import com.book.mall.ServiceImpl.UserServiceImpl;
import com.book.mall.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/user")
public class UserController {

    @Resource
    UserServiceImpl userServiceImpl;

    @GetMapping("/login")
    public String login()
    {
        return "/login";
    }

    @GetMapping("/success")
    public String success()
    {
        return "/index";
    }

    //登录使用
    @PostMapping(value = "/login2")
    public String login(@RequestParam("userName") String userName,
                        @RequestParam("password") String password,
//                        @RequestParam("verifyCode") String verifyCode,
                        HttpSession session) {
//        if (StringUtils.isEmpty(verifyCode)) {
//            session.setAttribute("errorMsg", "验证码不能为空");
//            return "admin/login";
//        }
        if (StringUtils.isEmpty(userName) || StringUtils.isEmpty(password)) {
            session.setAttribute("errorMsg", "用户名或密码不能为空");
            return "redirect:/user/login";
        }
//        String kaptchaCode = session.getAttribute("verifyCode") + "";
//        if (StringUtils.isEmpty(kaptchaCode) || !verifyCode.equals(kaptchaCode)) {
//            session.setAttribute("errorMsg", "验证码错误");
//            return "admin/login";
//        }
        User user = userServiceImpl.login(userName, password);
        if (user != null) {
            session.setAttribute("loginUser", user.getLogname());
            session.setAttribute("loginUserId", user.getId());
            return "redirect:/user/success";
        } else {
            session.setAttribute("errorMsg", "登录信息错误");
            return "redirect:/user/login";
        }
    }
}
