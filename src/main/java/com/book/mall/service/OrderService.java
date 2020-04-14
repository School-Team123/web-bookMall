package com.book.mall.service;

import com.book.mall.domain.Order;

import java.util.List;

public interface OrderService {
    /**
     * 根据书名搜索书籍
     *
     * @param bookId
     * @return
     */
    List<Order> selectOrderById(Integer bookId);

    /**
     * 根据用户id获取所有订单
     *
     * @param userId
     * @return
     */
    List<Order> selectOrderByUserId(Integer userId);

    /**
     * 获取本周热销书籍
     *
     *
     * @return
     */
    List<Order> selectWeekHotBook();

    /**
     * 获取本月热销书籍
     *
     *
     * @return
     */
    List<Order> selectMonthHotBook();
}
