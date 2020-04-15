package com.book.mall.controller;

import com.book.mall.ServiceImpl.ManagerServiceImpl;
import com.book.mall.domain.Manager;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("/manager")
public class ManagerController {
    @Resource
    ManagerServiceImpl managerServiceImpl;

    @PostMapping("/managerLogin")
    @ResponseBody
    public int login(@RequestParam("logName") String logname,
                     @RequestParam("password") String password)
    {
        Manager manager = managerServiceImpl.login(logname, password);
        if(manager!=null)
        {
            return 1;
        }else {
            return 0;
        }
    }
}
