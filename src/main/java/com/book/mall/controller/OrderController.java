package com.book.mall.controller;

import com.book.mall.ServiceImpl.OrderServiceImpl;
import com.book.mall.domain.Order;
import com.book.mall.util.Result;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/Order")
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
