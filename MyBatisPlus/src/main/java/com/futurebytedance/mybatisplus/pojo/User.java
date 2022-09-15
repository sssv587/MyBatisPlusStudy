package com.futurebytedance.mybatisplus.pojo;

import lombok.*;

/**
 * @author yuhang.sun
 * @version 1.0
 * @date 2022/9/16 - 0:53
 * @Description
 */
@Data
public class User {
    private Long id;
    private String name;
    private Integer age;
    private String email;
}
