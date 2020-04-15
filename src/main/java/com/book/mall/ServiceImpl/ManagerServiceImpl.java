package com.book.mall.ServiceImpl;

import com.book.mall.dao.ManagerDao;
import com.book.mall.domain.Manager;
import com.book.mall.service.ManagerService;
import com.book.mall.util.MD5Util;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ManagerServiceImpl implements ManagerService {
    @Resource
    ManagerDao managerDao;

    @Override
    public Manager login(String managerName, String password) {
        //String passwordMd5 = MD5Util.MD5Encode(password, "UTF-8");
        return managerDao.loginManager(managerName, password);
    }
}
