package com.futurebytedance.mybatisplus.pojo;

import lombok.Data;

/**
 * @author yuhang.sun
 * @version 1.0
 * @date 2022/9/17 - 0:23
 * @Description
 */
@Data
public class Product {
    private Long id;
    private String name;
    private Integer price;
    private Integer version;
}
