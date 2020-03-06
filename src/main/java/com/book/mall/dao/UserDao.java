package com.book.mall.dao;

import com.book.mall.domain.User;

import java.util.List;

public interface UserDao {
    /**
     * 返回数据列表
     *
     * @return
     */
    List<User> findAllUsers();

    /**
     * 添加
     *
     * @param User
     * @return
     */
    int insertUser(User User);


}
