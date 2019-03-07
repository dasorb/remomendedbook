package com.showbook.dao;

import com.showbook.pojo.BookDetail;
import org.apache.ibatis.annotations.Mapper;

/**
 *
 * @author chenjie
 * @date 2019/3/7 0007 - 11:13
 */
@Mapper
public interface BookDetailMapper {

    BookDetail queryBookDetailById (Integer id);

}
