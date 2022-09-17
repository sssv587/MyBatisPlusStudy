package com.futurebytedance.mybatisplus.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.futurebytedance.mybatisplus.mapper.UserMapper;
import com.futurebytedance.mybatisplus.pojo.User;
import com.futurebytedance.mybatisplus.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author yuhang.sun
 * @version 1.0
 * @date 2022/9/17 - 15:22
 * @Description
 */
@Service
@DS("master")
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
