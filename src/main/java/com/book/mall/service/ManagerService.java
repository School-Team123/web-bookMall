package com.book.mall.service;

import com.book.mall.domain.Manager;

public interface ManagerService {
    /**
     * 登录
     *
     * @param managerName
     * @param password
     * @return
     */
    Manager login(String managerName, String password);
}
