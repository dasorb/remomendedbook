package com.showbook.service.impl;

import com.showbook.dao.TUserMapper;
import com.showbook.pojo.TUser;
import com.showbook.pojo.TUserExample;
import com.showbook.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    public TUserMapper getUserMapper() {
        return userMapper;
    }

    public void setUserMapper(TUserMapper userMapper) {
        this.userMapper = userMapper;
    }
}
