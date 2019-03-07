package com.showbook.pojo;

import java.util.Date;

/**
 *  图书详细信息
 * @author chenjie
 * @date 2019/3/7 0007 - 11:03
 */
public class BookDetail {

    private Integer bookId; //图书id
    private String bookName; //图书名称
    private String author;//作者
    private String publishHouse; //出版设
    private Date publishDate; //出版日期
    private Double price; //定价
    private String isbnNum; //ISBN号
    private String note; //图书简介

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublishHouse() {
        return publishHouse;
    }

    public void setPublishHouse(String publishHouse) {
        this.publishHouse = publishHouse;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setIsbnNum(String isbnNum) {
        this.isbnNum = isbnNum;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getIsbnNum() {
        return isbnNum;
    }

    @Override
    public String toString() {
        return "BookDetail{" +
                "bookId=" + bookId +
                ", bookName='" + bookName + '\'' +
                ", author='" + author + '\'' +
                ", publishHouse='" + publishHouse + '\'' +
                ", publishDate=" + publishDate +
                ", price=" + price +
                ", isbnNum=" + isbnNum +
                ", note='" + note + '\'' +
                '}';
    }
}
