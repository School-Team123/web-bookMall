package com.book.mall.domain;

import java.util.Date;

public class Order {
    //对应ID_order
    private Integer id;

    //对应User_Name
    private String userName;

    //对应User_address
    private String address;

    //d对应User_id
    private Integer userId;

    //对应User_tel
    private String userTel;

    //对应Book_id
    private int bookId;

    //对应Book_nums
    private Integer bookNums;

    //对应Status
    private Integer status;

    //对应Good_price这里指单价
    private Integer goodPrice;

    //对应Comment
    private String comment;

    //对应Comment_num这里指评论满意度
    private Integer commentNum;

    //对应order_delete
    private Integer orderDelete;

    private Date orderTime;

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setUserTel(String userTel) {
        this.userTel = userTel;
    }

    public String getUserTel() {
        return userTel;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookNums(Integer bookNums) {
        this.bookNums = bookNums;
    }

    public Integer getBookNums() {
        return bookNums;
    }

    public void setGoodPrice(Integer goodPrice) {
        this.goodPrice = goodPrice;
    }

    public Integer getGoodPrice() {
        return goodPrice;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getStatus() {
        return status;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getComment() {
        return comment;
    }

    public void setCommentNum(Integer commentNum) {
        this.commentNum = commentNum;
    }

    public Integer getCommentNum() {
        return commentNum;
    }

    public void setOrderDelete(Integer orderDelete) {
        this.orderDelete = orderDelete;
    }

    public Integer getOrderDelete() {
        return orderDelete;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public Date getOrderTime() {
        return orderTime;
    }


}

