package com.atguigu.gmall.user.service.impl;


import com.alibaba.dubbo.config.annotation.Service;
import com.atguigu.gmall.bean.UserMember;
import com.atguigu.gmall.bean.UserMemberReceiveAddress;
import com.atguigu.gmall.user.mapper.UserMapper;
import com.atguigu.gmall.user.mapper.UserMapperReceiveAddress;
import com.atguigu.gmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;


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
