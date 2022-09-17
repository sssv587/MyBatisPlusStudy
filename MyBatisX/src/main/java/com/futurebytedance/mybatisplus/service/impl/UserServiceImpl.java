package com.futurebytedance.mybatisplus.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.futurebytedance.mybatisplus.pojo.User;
import com.futurebytedance.mybatisplus.service.UserService;
import com.futurebytedance.mybatisplus.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
 * @author 10926
 * @description 针对表【t_user】的数据库操作Service实现
 * @createDate 2022-09-17 15:50:44
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}




