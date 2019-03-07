package com.showbook.service.impl;

import com.showbook.dao.BookDetailMapper;
import com.showbook.pojo.BookDetail;
import com.showbook.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    public BookDetailMapper getBookDetailMapper() {
        return bookDetailMapper;
    }

    public void setBookDetailMapper(BookDetailMapper bookDetailMapper) {
        this.bookDetailMapper = bookDetailMapper;
    }
}
