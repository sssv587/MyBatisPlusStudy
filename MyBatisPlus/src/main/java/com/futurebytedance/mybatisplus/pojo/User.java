package com.futurebytedance.mybatisplus.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

/**
 * @author yuhang.sun
 * @version 1.0
 * @date 2022/9/16 - 0:53
 * @Description
 */
@Data
//设置实体类所对应的表名
//@TableName("user")
public class User {
    //将属性所对应的字段指定为主键
    //@TableId注解的value属性用于指定主键的字段
    //@TableId注解的type属性设置主键生成策略
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    private String name;
    private Integer age;
    private String email;
}
