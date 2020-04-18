package com.book.mall.ServiceImpl;

import com.book.mall.dao.ManagerDao;
import com.book.mall.domain.Manager;
import com.book.mall.service.ManagerService;
import com.book.mall.util.MD5Util;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;

@Service
public class ManagerServiceImpl implements ManagerService {
    @Resource
    ManagerDao managerDao;

    @Override
    public Manager login(String managerName, String password) {
        //String passwordMd5 = MD5Util.MD5Encode(password, "UTF-8");
        return managerDao.loginManager(managerName, password);
    }

    @Override
    public void addBook( String bookname, String author, int language, String category, int commend, String content, int price, Date onsaletime, String goodprice, String publishname, String publishaddress, int booknum, String imagepath, int salenum)
    {
        managerDao.addBook(bookname,author,language,category,commend,content,price,onsaletime,goodprice,publishname,publishaddress,booknum,imagepath,salenum);
    }

    @Override
    public void changeBookInfo(int id, String bookname, String author, int language, String category, int commend, String content, int price, Date onsaletime,String goodprice,String publishname,String publishaddress,int booknum,String imagepath,int salenum)
    {
        managerDao.changeBookInfo(id,bookname,author,language,category,commend,content,price,onsaletime,goodprice,publishname,publishaddress,booknum,imagepath,salenum);
    }
    @Override
    public void deleteBook(int id){
        managerDao.deleteBook(id);
    }
}
