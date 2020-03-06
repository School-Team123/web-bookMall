package com.book.mall.domain;

import java.util.Date;

public class Book {
    private int ID_book;
    private String Name_book;
    private String Author;
    private int Language;
    private int Category;
    private int Commend;
    private String Content;
    private String Price;
    private Date On_Sale_Time;
    private String Good_Price;
    private String Publish_Name;
    private String Publish_address;
    private int Book_Num;
    private String Image_Path;

    public int getID_book() {
        return ID_book;
    }

    public void setID_book(int ID_book) {
        this.ID_book = ID_book;
    }

    public String getName_book() {
        return Name_book;
    }

    public void setName_book(String name_book) {
        Name_book = name_book;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public int getLanguage() {
        return Language;
    }

    public void setLanguage(int language) {
        Language = language;
    }

    public int getCategory() {
        return Category;
    }

    public void setCategory(int category) {
        Category = category;
    }

    public int getCommend() {
        return Commend;
    }

    public void setCommend(int commend) {
        Commend = commend;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        Price = price;
    }

    public Date getOn_Sale_Time() {
        return On_Sale_Time;
    }

    public void setOn_Sale_Time(Date on_Sale_Time) {
        On_Sale_Time = on_Sale_Time;
    }

    public String getGood_Price() {
        return Good_Price;
    }

    public void setGood_Price(String good_Price) {
        Good_Price = good_Price;
    }

    public String getPublish_Name() {
        return Publish_Name;
    }

    public void setPublish_Name(String publish_Name) {
        Publish_Name = publish_Name;
    }

    public String getPublish_address() {
        return Publish_address;
    }

    public void setPublish_address(String publish_address) {
        Publish_address = publish_address;
    }

    public int getBook_Num() {
        return Book_Num;
    }

    public void setBook_Num(int book_Num) {
        Book_Num = book_Num;
    }

    public String getImage_Path() {
        return Image_Path;
    }

    public void setImage_Path(String image_Path) {
        Image_Path = image_Path;
    }
}
