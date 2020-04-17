package com.atguigu.gmall.user.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.atguigu.gmall.bean.UserMember;
import com.atguigu.gmall.bean.UserMemberReceiveAddress;
import com.atguigu.gmall.service.UserService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {

    @Reference  //远程的时候使用
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
