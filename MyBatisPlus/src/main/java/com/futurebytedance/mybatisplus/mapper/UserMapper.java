package com.futurebytedance.mybatisplus.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.futurebytedance.mybatisplus.pojo.User;
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
}
