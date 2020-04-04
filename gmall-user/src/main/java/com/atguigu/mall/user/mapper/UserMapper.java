package com.atguigu.mall.user.mapper;


import com.atguigu.mall.user.bean.UserMember;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;


public interface UserMapper extends Mapper<UserMember> {

    List<UserMember> selectAllUser();

}
