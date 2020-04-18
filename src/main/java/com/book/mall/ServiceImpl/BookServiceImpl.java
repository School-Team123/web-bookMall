package com.book.mall.ServiceImpl;

import com.book.mall.dao.BookDao;
import com.book.mall.domain.Book;
import com.book.mall.service.BookService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    @Resource
    BookDao bookDao;

    @Override
    public List<Book> selectBookByName(String bookName)
    {
        return bookDao.selectBookByName(bookName);
    }

    @Override
    public int getBookCount()
    {
        return bookDao.getBookCount();
    }

    @Override
    public List<Book> getBookPage(int start, int limit)
    {
        return bookDao.getBookPage(start,limit);
    }

    @Override
    public List<Book> getDiscountBooks()
    {
        return bookDao.getDiscountBooks();
    }

    @Override
    public  Book selectBookById(Integer bookId)
    {
        return bookDao.selectBookById(bookId);
    }
}
