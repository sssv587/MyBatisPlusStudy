package com.futurebytedance.mybatisplus.mapper;
import org.apache.ibatis.annotations.Param;

import com.futurebytedance.mybatisplus.pojo.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
* @author 10926
* @description 针对表【t_user】的数据库操作Mapper
* @createDate 2022-09-17 15:50:43
* @Entity com.futurebytedance.mybatisplus.pojo.User
*/
public interface UserMapper extends BaseMapper<User> {

    int insertSelective(User user);

    int deleteByIdAndName(@Param("id") Long id, @Param("name") String name);

    int updateAgeAndSexById(@Param("age") Integer age, @Param("sex") Integer sex, @Param("id") Long id);

    List<User> selectAgeAndSexByAgeBetween(@Param("beginAge") Integer beginAge, @Param("endAge") Integer endAge);

    List<User> selectAllOrderByAgeDesc();
}




