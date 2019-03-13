package com.showbook.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.showbook.dao.BookDetailMapper;
import com.showbook.pojo.BookDetail;
import com.showbook.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 * @author chenjie
 * @date 2019/3/7 0007 - 13:29
 */
@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDetailMapper bookDetailMapper;

    @Override
    public BookDetail queryBookDetail(Integer id) {
        return bookDetailMapper.queryBookDetailById(id);
    }

    @Override
    public PageInfo<BookDetail> queryBooks(int currentPage, int pageSize) {
        PageHelper.startPage(currentPage, pageSize);
        //紧跟第一条会被分页
        List<BookDetail> bookDetails = bookDetailMapper.queryBooks();
        //使用pageinfo对结果进行包装
        PageInfo page = new PageInfo(bookDetails);
        return page;
    }

    public BookDetailMapper getBookDetailMapper() {
        return bookDetailMapper;
    }

    public void setBookDetailMapper(BookDetailMapper bookDetailMapper) {
        this.bookDetailMapper = bookDetailMapper;
    }
}
