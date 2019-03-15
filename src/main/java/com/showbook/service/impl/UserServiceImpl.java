package com.showbook.service.impl;

import com.showbook.dao.TUserMapper;
import com.showbook.pojo.TUser;
import com.showbook.pojo.TUserExample;
import com.showbook.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @author chenjie
 * @date 2019/3/14 0014 - 16:16
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private TUserMapper userMapper;

    @Override
    public TUser getUserByUserName(String userName) {
        TUserExample tUserExample = new TUserExample();
        TUserExample.Criteria criteria = tUserExample.createCriteria();
        criteria.andUsernameEqualTo(userName);
        List<TUser> usersList = userMapper.selectByExample(tUserExample);
        TUser tUser = null;

        if(usersList != null && usersList.size() != 0) {
            tUser= usersList.get(0);
        }

        return tUser;
    }

    @Override
    public boolean validatePassword(String userPassword, String inPassword) {
        if(userPassword.equals(inPassword)) {
            return true;
        }
        return false;
    }

    /**
     * 用户名是否存在
     * @param username
     * @return
     */
    @Override
    public boolean isExistUsername(String username) {

        TUserExample tUserExample = new TUserExample();
        TUserExample.Criteria criteria = tUserExample.createCriteria();
        criteria.andUsernameEqualTo(username);

        List<TUser> tUsers = userMapper.selectByExample(tUserExample);

        if (!tUsers.isEmpty()) {
            return true;
        }
        return false;
    }

    /**
     * 注册用户
     *
     */
    @Override
    public void insertUser(String username, String password) {
        TUser tUser = new TUser();
        Date now = new Date();
        tUser.setRegisterDate(now);
        tUser.setLastLoginDate(now);
        tUser.setUsername(username);
        tUser.setPassword(password);

        userMapper.insert(tUser);
    }




    public TUserMapper getUserMapper() {
        return userMapper;
    }

    public void setUserMapper(TUserMapper userMapper) {
        this.userMapper = userMapper;
    }
}
