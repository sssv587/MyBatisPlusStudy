package com.futurebytedance.mybatisplus;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.futurebytedance.mybatisplus.mapper.UserMapper;
import com.futurebytedance.mybatisplus.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Map;

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

    //组装删除条件
    @Test
    public void test03() {
        //删除邮箱地址为null的用户信息
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.isNull("email");
        int result = userMapper.delete(queryWrapper);
        System.out.println("result:" + result);
    }

    //实现修改功能
    @Test
    public void test04() {
        //将(年龄大于20并且用户名中含有a)或邮箱为null的用户信息修改
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.gt("age", 20)
                .like("name", "a")
                .or()
                .isNull("email");
        User user = new User();
        user.setName("小明");
        user.setEmail("test@123456@qq.com");
        int result = userMapper.update(user, queryWrapper);
        System.out.println("result:" + result);
    }

    //条件的优先级
    @Test
    public void test05() {
        //将用户名中含有a并且(年龄大于20或邮箱为null)的用户信息修改
        //lambda中的条件优先执行
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.like("name", "a")
                .and(i -> i.gt("age", 20).or().isNull("email"));
        User user = new User();
        user.setName("小红");
        user.setEmail("test@123456@qq.com");
        int result = userMapper.update(user, queryWrapper);
        System.out.println("result:" + result);
    }


    //组装Select语句
    @Test
    public void test06() {
        //查询用户名、年龄、邮箱信息
        //SELECT name,age,email FROM t_user WHERE is_deleted=0
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.select("name", "age", "email");
        List<Map<String, Object>> maps = userMapper.selectMaps(queryWrapper);
        maps.forEach(System.out::println);
    }

    //组装子查询
    @Test
    public void test07() {
        //查询id小于等于100的用户信息
        //SELECT id,name,age,email,is_deleted FROM t_user WHERE is_deleted=0 AND (id IN (select id from t_user where id <= 100))
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.inSql("id", "select id from t_user where id <= 100");
        List<User> list = userMapper.selectList(queryWrapper);
        list.forEach(System.out::println);
    }
}
