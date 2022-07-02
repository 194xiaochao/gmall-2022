package com.atguigu.gmall.user.service;

import com.atguigu.gmall.user.bean.UmsMember;
import com.atguigu.gmall.user.bean.UmsMemberReceiveAddress;

import java.util.List;


public interface UserService {
    /**
     * 查询所有用户信息
     * @return
     */
    List<UmsMember> getAllUser();
    /**
     * 根据用户ID查询收货地址
     */
    List<UmsMemberReceiveAddress> getUserAddress(String userId);

}
