package com.showbook.service;

import com.showbook.pojo.TUser;

/**
 *
 *  用户信息操作
 * @author chenjie
 * @date 2019/3/14 0014 - 16:13
 */
public interface UserService {

    TUser getUserByUserName(String userName);

    boolean validatePassword(String userPassword , String inPassword);

    boolean isExistUsername(String username);

    void insertUser(String username, String password);
}
