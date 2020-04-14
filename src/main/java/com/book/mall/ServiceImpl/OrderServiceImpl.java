package com.book.mall.ServiceImpl;

import com.book.mall.dao.OrderDao;
import com.book.mall.domain.Order;
import com.book.mall.service.OrderService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Resource
    OrderDao orderDao;

    @Override
    public List<Order> selectOrderById(Integer  bookId)
    {
        return  orderDao.selectOrderById(bookId);
    }

    @Override
    public List<Order> selectOrderByUserId(Integer userId)
    {
        return orderDao.selectOrderByUserId(userId);
    }

    @Override
    public List<Order> selectWeekHotBook()
    {

        return orderDao.selectWeekHotBook();
    }
    @Override
    public List<Order> selectMonthHotBook()
    {

        return orderDao.selectMonthHotBook();
    }
}
