package com.book.mall.controller;

import com.book.mall.ServiceImpl.BookServiceImpl;
import com.book.mall.ServiceImpl.OrderServiceImpl;
import com.book.mall.domain.Book;
import com.book.mall.domain.Order;
import com.book.mall.util.PageResult;
import com.book.mall.util.Result;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

import static com.book.mall.controller.ManagerController.ipPath;

@Controller
@RequestMapping("/book")
public class BookController {

    @Resource
    BookServiceImpl bookServiceImpl;
    @Resource
    OrderServiceImpl orderServiceImpl;

    @PostMapping("/selectBookByName")
    @ResponseBody
    public Result selectBookByName(@RequestParam("bookName") String bookName) {
        Result<List<Book>> result = new Result<>();
        if(bookName != "")
        {
            result.setResultCode(200);
            result.setData(bookServiceImpl.selectBookByName(bookName));
            result.setMessage("查询成功");
        }
        else
        {
            result.setResultCode(200);
            result.setMessage("空");
            result.setData(null);
        }

        return result;
    }

    @GetMapping("/BookCount")
    @ResponseBody
    public Result getBookCount()
    {
        Result<Integer> result = new Result<>();
        result.setResultCode(200);
        result.setMessage("获取书籍总数量成功");
        result.setData(bookServiceImpl.getBookCount());
        return result;
    }

    @GetMapping("/Pages")
    @ResponseBody
    public PageResult Pages(HttpServletRequest request, @RequestParam(value = "page", required = true) Integer page){
        int start = (page - 1) * 10;
        int limit = 10;
        int size = bookServiceImpl.getBookCount();
        PageResult pageResult = new PageResult(bookServiceImpl.getBookPage(start,limit),size,limit,page);
        return pageResult;
    }

    @GetMapping("/DiscountBook")
    @ResponseBody
    public Result getDiscountBooks()
    {
        Result<List<Book>> result = new Result<>();
        result.setResultCode(200);
        result.setMessage("获取折扣书籍成功");
        result.setData(bookServiceImpl.getDiscountBooks());
        return result;
    }

    @PostMapping("/selectBookById")
    @ResponseBody
    public Result getComment(@RequestParam("bookId") Integer bookId)
    {
        //返回的内容包括评论
        Result<List> result = new Result<>();
        result.setResultCode(200);
        result.setMessage("获取书籍成功");
        List a = new ArrayList();
        String []temp1 = bookServiceImpl.selectBookById(bookId).getCategory().split("#");
        List <String> temp2 = new ArrayList<>();
        for(String x :  temp1){
            switch (x)
            {
                case "1": temp2.add("计算机类");
                break;
                case "2": temp2.add("人文类");
                break;
                case "3": temp2.add("工程类");
                break;
                case "4": temp2.add("哲学类");
                break;
            }
        }
        Book b=bookServiceImpl.selectBookById(bookId);
        b.setImage_Path(ipPath+b.getImage_Path());
        a.add(b);
        a.add(temp2);
        a.add(orderServiceImpl.selectOrderById(bookId));
        result.setData(a);
        return result;
    }
}
