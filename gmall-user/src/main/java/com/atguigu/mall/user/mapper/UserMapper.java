package com.atguigu.mall.user.mapper;


import com.atguigu.mall.user.bean.UserMember;

import java.util.List;

public interface UserMapper {
    List<UserMember> selectAllUser();
}
