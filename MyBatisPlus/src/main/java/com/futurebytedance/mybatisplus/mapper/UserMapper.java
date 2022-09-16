package com.futurebytedance.mybatisplus.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.futurebytedance.mybatisplus.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.Map;

/**
 * @author yuhang.sun
 * @version 1.0
 * @date 2022/9/16 - 0:59
 * @Description
 */
@Repository
public interface UserMapper extends BaseMapper<User> {
    /**
     * 根据用户id查询为map集合
     * @param id id
     * @return map集合
     */
    Map<String, Object> selectMapById(Long id);


    /**
     * 通过年龄查询用户信息并分页
     * @param page MyBatis-Plus所提供的分页对象,必须位于第一个参数的位置
     * @param age 年龄
     * @return 分页数据
     */
    Page<User> selectPageVo(@Param("page") Page<User> page, @Param("age") Integer age);
}
