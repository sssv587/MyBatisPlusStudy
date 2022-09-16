package com.futurebytedance.mybatisplus;

import com.futurebytedance.mybatisplus.enums.SexEnum;
import com.futurebytedance.mybatisplus.mapper.UserMapper;
import com.futurebytedance.mybatisplus.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author yuhang.sun
 * @version 1.0
 * @date 2022/9/17 - 0:46
 * @Description
 */
@SpringBootTest
public class MyBatisPlusEnumTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void test() {
        User user = new User();
        user.setName("admin");
        user.setAge(20);
        user.setSex(SexEnum.MALE);
        int result = userMapper.insert(user);
        System.out.println("result:" + result);
    }
}
