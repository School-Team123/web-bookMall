package com.book.mall.service;

import com.book.mall.domain.User;

public interface UserService {
    /**
     * 登录
     *
     * @param userName
     * @param password
     * @return
     */
    User login(String userName, String password);
}
