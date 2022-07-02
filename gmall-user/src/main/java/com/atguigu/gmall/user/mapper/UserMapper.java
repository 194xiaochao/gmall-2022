package com.atguigu.gmall.user.mapper;


import com.atguigu.gmall.user.bean.UmsMember;
import com.atguigu.gmall.user.bean.UmsMemberReceiveAddress;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * 通用mapper加入，单表的增删改查不需要写
 *
 */
public interface UserMapper extends Mapper<UmsMember> {

}
