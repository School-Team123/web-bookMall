package com.book.mall.service;

import com.book.mall.domain.Manager;

import java.util.Date;

public interface ManagerService {
    /**
     * 登录
     *
     * @param managerName
     * @param password
     * @return
     */
    Manager login(String managerName, String password);

    /**
     * 新增书籍
     *
     *
     * @param bookname
     * @param author
     * @param language
     * @param category
     * @param commend
     * @param content
     * @param price
     * @param onsaletime
     * @param goodprice
     * @param publishname
     * @param publishaddress
     * @param booknum
     * @param imagepath
     * @param salenum
     *
     */
    void addBook( String bookname, String author, int language, String category, int commend, String content, int price, Date onsaletime,String goodprice,String publishname,String publishaddress,int booknum,String imagepath,int salenum);

    /**
     * 修改书籍信息
     *
     *
     * @param bookname
     * @param author
     * @param language
     * @param category
     * @param commend
     * @param content
     * @param price
     * @param onsaletime
     * @param goodprice
     * @param publishname
     * @param publishaddress
     * @param booknum
     * @param imagepath
     * @param salenum
     *
     */
    void changeBookInfo( int id,String bookname, String author, int language, String category, int commend, String content, int price, Date onsaletime,String goodprice,String publishname,String publishaddress,int booknum,String imagepath,int salenum);

    /**
     * 删除书籍
     *
     * @param bookId
     *
     */
     void deleteBook(int bookId);
}
