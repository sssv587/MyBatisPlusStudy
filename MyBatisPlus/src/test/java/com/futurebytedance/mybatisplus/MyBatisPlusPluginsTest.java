package com.futurebytedance.mybatisplus;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.futurebytedance.mybatisplus.mapper.UserMapper;
import com.futurebytedance.mybatisplus.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author yuhang.sun
 * @version 1.0
 * @date 2022/9/16 - 23:55
 * @Description
 */
@SpringBootTest
public class MyBatisPlusPluginsTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void testPage() {
        Page<User> page = new Page<>(2, 3);
        userMapper.selectPage(page, null);
        System.out.println(page.getRecords());
        System.out.println(page.getPages());
        System.out.println(page.getTotal());
        System.out.println(page.hasNext());
        System.out.println(page.hasPrevious());
    }

    @Test
    public void testPageVo() {
        Page<User> page = new Page<>(1, 3);
        userMapper.selectPageVo(page, 20);
        System.out.println(page.getRecords());
        System.out.println(page.getPages());
        System.out.println(page.getTotal());
        System.out.println(page.hasNext());
        System.out.println(page.hasPrevious());
    }
}
