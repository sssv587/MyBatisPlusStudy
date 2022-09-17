package com.futurebytedance.mybatisplus.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author yuhang.sun
 * @version 1.0
 * @date 2022/9/17 - 15:16
 * @Description
 */
@Data
@TableName("t_user")
public class User {
    @TableId
    private Long id;

    private String name;

    private Integer age;

    private String email;

    private Integer sex;

    private Integer isDeleted;
}
