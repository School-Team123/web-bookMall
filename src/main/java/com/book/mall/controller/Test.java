package com.book.mall.controller;

import com.book.mall.dao.UserDao;
import com.book.mall.domain.User;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class Test {
    @Resource
    UserDao userDao;

    // 查询所有记录
    @GetMapping("/users/queryAll")
    public List<User> queryAll() {
        return userDao.findAllUsers();
    }

    // 新增一条记录
    @GetMapping("/users/mybatis/insert")
    public Boolean insert(Integer id,String logname, String realname,String password,String email,Integer gender,String province,String education,String hobbies,
                          String selfIntro,String imagePath) {
        if (StringUtils.isEmpty(logname) || StringUtils.isEmpty(password)) {
            return false;
        }
        User user = new User();
        user.setId(id);
        user.setLogname(logname);
        user.setPassword(password);
        user.setRealname(realname);
        user.setGender(gender);
        user.setEmail(email);
        user.setProvince(province);
        user.setEducation(education);
        user.setHobbies(hobbies);
        user.setSelfintro(selfIntro);
        user.setImagePath(imagePath);
        return userDao.insertUser(user) > 0;
    }
}
