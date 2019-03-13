package com.showbook.service;

import com.github.pagehelper.PageInfo;
import com.showbook.pojo.BookDetail;

import java.util.List;

/**
 * @author chenjie
 * @date 2019/3/7 0007 - 13:28
 */
public interface BookService {

    BookDetail queryBookDetail(Integer id);

    PageInfo<BookDetail> queryBooks(int currentPage, int pageSize);

}
