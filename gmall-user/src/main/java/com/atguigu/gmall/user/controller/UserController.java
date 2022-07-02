package com.atguigu.gmall.user.controller;

import com.atguigu.gmall.user.bean.UmsMember;
import com.atguigu.gmall.user.bean.UmsMemberReceiveAddress;
import com.atguigu.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 查询所有用户信息
     * @return
     */
    @GetMapping("getUser")
    public List<UmsMember> getAllUser() {
        List<UmsMember> umsMembers = userService.getAllUser();
        return umsMembers;
    }
    /**
     *
     */
    @GetMapping("getUserAddress")
    public List<UmsMemberReceiveAddress> getAllUserAddress( String userId) {
        List<UmsMemberReceiveAddress> userAddress = userService.getUserAddress(userId);
        return userAddress;
    }
}
