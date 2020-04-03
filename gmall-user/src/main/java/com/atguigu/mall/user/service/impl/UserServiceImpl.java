package com.atguigu.mall.user.service.impl;

import com.atguigu.mall.user.bean.UserMember;
import com.atguigu.mall.user.mapper.UserMapper;
import com.atguigu.mall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public List<UserMember> getAllUser() {
        List<UserMember> userMemberList=userMapper.selectAllUser();
        return userMemberList;
    }
}
