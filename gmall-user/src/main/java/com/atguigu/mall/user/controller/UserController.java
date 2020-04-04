package com.atguigu.mall.user.controller;


import com.atguigu.mall.user.bean.UserMember;
import com.atguigu.mall.user.bean.UserMemberReceiveAddress;
import com.atguigu.mall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    UserService userService;
    @RequestMapping("/getReceiveAddressByMemberId")
    @ResponseBody
    public List<UserMemberReceiveAddress> getReceiveAddressByMemberId(String memberId){
        List<UserMemberReceiveAddress> userMemberReceiveAddresses = userService.getReceiveAddressByMemberId(memberId);
        return  userMemberReceiveAddresses;
    }

    @RequestMapping("/getAllUser")
    @ResponseBody
    public List<UserMember> getAllUser(){
        List<UserMember> userMembers = userService.getAllUser();
        return  userMembers;
    }

    @RequestMapping("hello")
    @ResponseBody
    public String hello(){
        return  "hello svm";
    }

}
