package com.showbook.controller;

import com.showbook.pojo.BookDetail;
import com.showbook.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author chenjie
 * @date 2019/3/7 0007 - 13:39
 */
@Controller
public class BookController {

    @Autowired
    private BookService bookService;

    @RequestMapping("/book/{id}")
    @ResponseBody
    public BookDetail getBook(@PathVariable("id")Integer id, Model model){
        //通过路径中的id值，查询到相应书籍，返回对应的信息
        BookDetail bookDetail = bookService.queryBookDetail(id);
        return bookDetail;
    }



    public BookService getBookService() {
        return bookService;
    }

    public void setBookService(BookService bookService) {
        this.bookService = bookService;
    }
}
