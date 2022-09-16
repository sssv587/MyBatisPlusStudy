package com.futurebytedance.mybatisplus;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.futurebytedance.mybatisplus.mapper.UserMapper;
import com.futurebytedance.mybatisplus.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @author yuhang.sun
 * @version 1.0
 * @date 2022/9/16 - 18:00
 * @Description
 */
@SpringBootTest
public class MyBatisPlusWrapperTest {
    @Autowired
    private UserMapper userMapper;

    //组装查询条件
    @Test
    public void test01() {
        //查询用户名包含a,年龄在20到30之间,邮箱信息不为null的用户信息
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.like("name", "a")
                .between("age", 20, 30)
                .isNotNull("email");
        List<User> list = userMapper.selectList(queryWrapper);
        list.forEach(System.out::println);
    }

    //组装排序条件
    @Test
    public void test02() {
        //查询用户信息,按照年龄降序排序,如果年龄相同,则按照id升序
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.orderByDesc("age")
                .orderByAsc("id");
        List<User> list = userMapper.selectList(queryWrapper);
        list.forEach(System.out::println);
    }
}
