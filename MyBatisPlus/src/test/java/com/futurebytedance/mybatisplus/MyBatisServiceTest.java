package com.futurebytedance.mybatisplus;

import com.futurebytedance.mybatisplus.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author yuhang.sun
 * @version 1.0
 * @date 2022/9/16 - 15:54
 * @Description
 */
@SpringBootTest
public class MyBatisServiceTest {
    @Autowired
    private UserService userService;

    @Test
    public void testGetCount() {
        //查询总记录数
        //SELECT COUNT( * ) FROM user
        long count = userService.count();
        System.out.println("总记录数:" + count);
    }
}
