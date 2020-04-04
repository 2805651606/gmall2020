package com.atguigu.mall.user.service.impl;


import com.atguigu.mall.user.bean.UserMember;
import com.atguigu.mall.user.bean.UserMemberReceiveAddress;
import com.atguigu.mall.user.mapper.UserMapper;
import com.atguigu.mall.user.mapper.UserMapperReceiveAddress;
import com.atguigu.mall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Autowired
    UserMapperReceiveAddress userMapperReceiveAddress;


    @Override
    public List<UserMember> getAllUser() {
        List<UserMember> userMemberList = userMapper.selectAll();
        return userMemberList;
    }

    @Override
    public List<UserMemberReceiveAddress> getReceiveAddressByMemberId(String memberId) {
//        Example e = new Example(UserMemberReceiveAddress.class);
//        e.createCriteria().andAllEqualTo("memberId",memberId);
//        userMemberReceiveAddress.selectByExample(e);

        UserMemberReceiveAddress umsMemberReceiveAddress = new UserMemberReceiveAddress();
        umsMemberReceiveAddress.setMemberId(memberId);
        List<UserMemberReceiveAddress> userMemberReceiveAddressList = userMapperReceiveAddress.select(umsMemberReceiveAddress);
        return userMemberReceiveAddressList ;
    }
}
