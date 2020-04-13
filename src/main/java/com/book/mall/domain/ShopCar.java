package com.book.mall.domain;

public class ShopCar {
    private Integer userId;
    private Integer bookId;
    private Integer bookNum;

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookNum(Integer bookNum) {
        this.bookNum = bookNum;
    }

    public Integer getBookNum() {
        return bookNum;
    }
}
