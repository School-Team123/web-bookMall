package com.book.mall.controller;

import com.book.mall.ServiceImpl.BookServiceImpl;
import com.book.mall.ServiceImpl.ManagerServiceImpl;
import com.book.mall.domain.Manager;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.UUID;

@Controller
@RequestMapping("/manager")
public class ManagerController {
    @Resource
    ManagerServiceImpl managerServiceImpl;

    @PostMapping("/managerLogin")
    @ResponseBody
    public int login(@RequestParam("logName") String logname,
                     @RequestParam("password") String password)
    {
        Manager manager = managerServiceImpl.login(logname, password);
        if(manager!=null)
        {
            return 1;
        }else {
            return 0;
        }
    }
    //private String filePath="../../../../main/resources/static/";
    @PostMapping("/addBook")
    @ResponseBody
    public void addBook(@RequestParam("bookName") String bookName,
                        @RequestParam("author") String author,
                        @RequestParam("language") int language,
                        @RequestParam("category") String category,
                        @RequestParam("commend") int commend,
                        @RequestParam("content") String content,
                        @RequestParam("price") int price,
                        @RequestParam("onSaleTime")Date onSaleTime,
                        @RequestParam("goodPrice") String goodPrice,
                        @RequestParam("publishName") String publishName,
                        @RequestParam("publishAddress") String publishAddress,
                        @RequestParam("bookNum") int bookNum,
                        @RequestParam("imagePath") MultipartFile imagePath,
                        @RequestParam("saleNum") int saleNum
                        )
    {
        String filePath=System.getProperty("user.dir")+"/src/main/resources/static/images";
        //判断文件夹是否存在,不存在则创建
        File file=new File(filePath);

        if(!file.exists()){
            file.mkdirs();
        }
        String originalFileName = imagePath.getOriginalFilename();//获取原始图片的扩展名
        String newFileName = UUID.randomUUID()+originalFileName;
        String newFilePath=filePath+"/"+newFileName; //新文件的路径
        String dataBasePath="/src/main/resources/static/images/"+newFileName;

        try {
            imagePath.transferTo(new File(newFilePath));  //将传来的文件写入新建的文件

        }catch (IllegalStateException e ) {
            //处理异常
        }catch(IOException e1){
            //处理异常
        }
        managerServiceImpl.addBook(bookName,author,language,category,commend,content,price,onSaleTime,goodPrice,publishName,publishAddress,bookNum,dataBasePath,saleNum);
    }

    @Resource
    BookServiceImpl bookServiceImpl;
    @PostMapping("/changeBookInfo")
    @ResponseBody
    public void changeBookInfo(@RequestParam("bookId") int bookId,
                        @RequestParam("bookName") String bookName,
                        @RequestParam("author") String author,
                        @RequestParam("language") int language,
                        @RequestParam("category") String category,
                        @RequestParam("commend") int commend,
                        @RequestParam("content") String content,
                        @RequestParam("price") int price,
                        @RequestParam("onSaleTime")Date onSaleTime,
                        @RequestParam("goodPrice") String goodPrice,
                        @RequestParam("publishName") String publishName,
                        @RequestParam("publishAddress") String publishAddress,
                        @RequestParam("bookNum") int bookNum,
                        @RequestParam("imagePath") MultipartFile imagePath,
                        @RequestParam("saleNum") int saleNum
    )
    {
        String filePath=System.getProperty("user.dir")+"/src/main/resources/static/images";
        //判断文件夹是否存在,不存在则创建
        File file=new File(filePath);

        if(!file.exists()){
            file.mkdirs();
        }
        String originalFileName = imagePath.getOriginalFilename();//获取原始图片的扩展名
        String newFileName = UUID.randomUUID()+originalFileName;
        String newFilePath=filePath+"/"+newFileName; //新文件的路径
        String dataBasePath="/src/main/resources/static/images/"+newFileName;
        String p= bookServiceImpl.selectBookById(bookId).getImage_Path();
        File f=new File(System.getProperty("user.dir")+p);
        if(f.exists())
        {
            f.delete();
        }

        try {
            imagePath.transferTo(new File(newFilePath));  //将传来的文件写入新建的文件

        }catch (IllegalStateException e ) {
            //处理异常
        }catch(IOException e1){
            //处理异常
        }
        managerServiceImpl.changeBookInfo(bookId,bookName,author,language,category,commend,content,price,onSaleTime,goodPrice,publishName,publishAddress,bookNum,dataBasePath,saleNum);
    }

    @PostMapping("deleteBook")
    @ResponseBody
    public void deleteBook(@RequestParam("bookId") int id){
        managerServiceImpl.deleteBook(id);
    }
}
