package com.book.mall.ServiceImpl;

import com.book.mall.dao.UserDao;
import com.book.mall.domain.User;
import com.book.mall.service.UserService;
import com.book.mall.util.MD5Util;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    UserDao userDao;

    @Override
    public User login(String userName, String password) {
        String passwordMd5 = MD5Util.MD5Encode(password, "UTF-8");
        return userDao.login(userName, passwordMd5);
    }
}
