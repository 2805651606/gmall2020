package com.atguigu.gmall.user.mapper;


import com.atguigu.gmall.bean.UserMember;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;


public interface UserMapper extends Mapper<UserMember> {

    List<UserMember> selectAllUser();

}
