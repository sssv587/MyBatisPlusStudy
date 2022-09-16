package com.futurebytedance.mybatisplus;

import com.futurebytedance.mybatisplus.mapper.UserMapper;
import com.futurebytedance.mybatisplus.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @author yuhang.sun
 * @version 1.0
 * @date 2022/9/16 - 1:02
 * @Description
 */
@SpringBootTest
public class MyBatisPlusTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void testSelectList() {
        //查询条件构造器查询一个list集合,若没有条件,则可以设置null为参数
        List<User> list = userMapper.selectList(null);
        list.forEach(System.out::println);
    }

    @Test
    public void testInsert() {
        //实现新增用户信息
        User user = new User();
        user.setName("张三");
        user.setAge(23);
        user.setEmail("123@qq.com");
        int result = userMapper.insert(user);
        System.out.println("result:" + result);
        System.out.println("id:" + user.getId());
    }
}
