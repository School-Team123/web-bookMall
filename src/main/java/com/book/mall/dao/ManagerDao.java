package com.book.mall.dao;

import com.book.mall.domain.Manager;

import org.apache.ibatis.annotations.Param;

public interface ManagerDao {

    /**
     * 登录
     *
     * @param managerName
     * @param password
     * @return
     */
    Manager loginManager(@Param("logname") String managerName, @Param("password") String password);
}
