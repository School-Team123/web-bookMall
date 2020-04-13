package com.book.mall.dao;

import com.book.mall.domain.Order;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderDao {

    /**
     * 根据书名搜索书籍
     *
     * @param bookId
     * @return
     */
    List<Order> selectOrderById(Integer bookId);
}
