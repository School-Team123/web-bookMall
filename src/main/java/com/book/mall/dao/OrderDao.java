package com.book.mall.dao;

import com.book.mall.domain.Order;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface OrderDao {

    /**
     * 根据书id获取所有订单
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
