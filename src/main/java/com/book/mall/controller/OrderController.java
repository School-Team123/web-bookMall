package com.book.mall.controller;

import com.book.mall.ServiceImpl.BookServiceImpl;
import com.book.mall.ServiceImpl.OrderServiceImpl;
import com.book.mall.domain.Book;
import com.book.mall.domain.Order;
import com.book.mall.util.Result;
import org.joda.time.DateTime;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import static com.book.mall.controller.ManagerController.ipPath;

@Controller
@RequestMapping("/order")
public class OrderController {
    @Resource
    OrderServiceImpl orderServiceImpl;

    @PostMapping("/getCommentByBookId")
    @ResponseBody
    public Result getCommentById(@RequestParam("bookId") Integer  bookId)
    {
        Result<List<Order>> result = new Result<>();
        result.setResultCode(200);
        result.setMessage("获取评论成功");
        result.setData(orderServiceImpl.selectOrderById(bookId));
        return result;
    }

    @PostMapping("/getCommentByBookUserId")
    @ResponseBody
    public Result getOrderByUserId(@RequestParam("userId") Integer  userId)
    {
        Result<List<Order>> result = new Result<>();
        result.setResultCode(200);
        result.setMessage("根据用户id获取订单成功");
        result.setData(orderServiceImpl.selectOrderByUserId(userId));
        return result;
    }



}
