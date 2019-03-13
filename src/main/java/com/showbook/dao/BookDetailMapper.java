package com.showbook.dao;

import com.showbook.pojo.BookDetail;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 *
 * @author chenjie
 * @date 2019/3/7 0007 - 11:13
 */
@Mapper
//@Repository
public interface BookDetailMapper {

    BookDetail queryBookDetailById (Integer id);

    List<BookDetail> queryBooks();

}
