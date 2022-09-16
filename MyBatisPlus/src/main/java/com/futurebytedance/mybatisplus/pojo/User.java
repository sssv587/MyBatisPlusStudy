package com.futurebytedance.mybatisplus.pojo;

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
    private Long id;
    private String name;
    private Integer age;
    private String email;
}
