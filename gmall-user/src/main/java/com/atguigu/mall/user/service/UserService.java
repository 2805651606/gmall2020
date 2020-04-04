package com.atguigu.mall.user.service;





import com.atguigu.mall.user.bean.UserMember;
import com.atguigu.mall.user.bean.UserMemberReceiveAddress;

import java.util.List;

public interface UserService {
    List<UserMember> getAllUser();

    List<UserMemberReceiveAddress> getReceiveAddressByMemberId(String memberId);
}
