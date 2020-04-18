package com.book.mall.dao;

import com.book.mall.domain.Manager;

import org.apache.ibatis.annotations.Param;

import java.util.Date;

public interface ManagerDao {

    /**
     * 登录
     *
     * @param managerName
     * @param password
     * @return
     */
    Manager loginManager(@Param("logname") String managerName, @Param("password") String password);

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
    void addBook(@Param("bookName")String bookname, @Param("author")String author, @Param("language")int language, @Param("category")String category, @Param("commend")int commend, @Param("content")String content, @Param("price")int price, @Param("onSaleTime")Date onsaletime, @Param("goodPrice")String goodprice, @Param("publishName")String publishname, @Param("publishAddress")String publishaddress, @Param("bookNum")int booknum, @Param("imagePath")String imagepath, @Param("saleNum")int salenum);

    /**
     * 修改书籍信息
     *
     * @param bookid
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
    void changeBookInfo(@Param("bookId") int bookid,@Param("bookName")String bookname, @Param("author")String author, @Param("language")int language, @Param("category")String category, @Param("commend")int commend, @Param("content")String content, @Param("price")int price, @Param("onSaleTime")Date onsaletime, @Param("goodPrice")String goodprice, @Param("publishName")String publishname, @Param("publishAddress")String publishaddress, @Param("bookNum")int booknum, @Param("imagePath")String imagepath, @Param("saleNum")int salenum);

    /**
     *删除书籍
     * @param bookid

     */
    void deleteBook(@Param("bookId") int bookid);
}
