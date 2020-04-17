package com.atguigu.gmall.service;
import com.atguigu.gmall.bean.UserMember;
import com.atguigu.gmall.bean.UserMemberReceiveAddress;

import java.util.List;

public interface UserService {
    List<UserMember> getAllUser();

    List<UserMemberReceiveAddress> getReceiveAddressByMemberId(String memberId);
}
