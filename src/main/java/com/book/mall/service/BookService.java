package com.book.mall.service;

import com.book.mall.domain.Book;

import java.util.List;

public interface BookService {
    /**
     * 根据书名搜索数据
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
