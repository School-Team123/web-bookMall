package com.book.mall.dao;

import com.book.mall.domain.Book;

import java.util.List;

public interface BookDao {

    /**
     * 根据书名搜索书籍
     *
     * @param bookName
     * @return
     */
    List<Book> selectBookByName(String bookName);

    /**
     * 返回该页码的书籍
     *
     * @param start
     * @param limit
     * @return
     */
    List<Book> getBookPage(int start,int limit);

    /**
     * 获取书籍总数量
     *
     * @return
     */
    int getBookCount();
}
