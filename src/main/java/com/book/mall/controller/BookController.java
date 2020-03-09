package com.book.mall.controller;

import com.book.mall.ServiceImpl.BookServiceImpl;
import com.book.mall.domain.Book;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

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
    public List<Book> selectBookByName(HttpServletRequest request, @RequestParam("bookName") String bookName) {
        if(bookName != null)
        {
            return bookServiceImpl.selectBookByName(bookName);
        }
        else
        {
            return null;
        }
    }
}
