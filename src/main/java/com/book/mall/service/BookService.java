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
}
