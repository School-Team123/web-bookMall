package com.book.mall.controller;

import com.book.mall.ServiceImpl.BookServiceImpl;
import com.book.mall.domain.Book;
import com.book.mall.domain.Order;
import com.book.mall.util.PageResult;
import com.book.mall.util.Result;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {

    @Resource
    BookServiceImpl bookServiceImpl;

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
        Result<List<Book>> result = new Result<>();
        result.setResultCode(200);
        result.setMessage("获取书籍成功");
        result.setData(bookServiceImpl.selectBookById(bookId));
        return result;
    }
}
