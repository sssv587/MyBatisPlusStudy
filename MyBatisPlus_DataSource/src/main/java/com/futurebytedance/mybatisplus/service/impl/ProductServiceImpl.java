package com.futurebytedance.mybatisplus.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.futurebytedance.mybatisplus.mapper.ProductMapper;
import com.futurebytedance.mybatisplus.pojo.Product;
import com.futurebytedance.mybatisplus.service.ProductService;
import org.springframework.stereotype.Service;

/**
 * @author yuhang.sun
 * @version 1.0
 * @date 2022/9/17 - 15:26
 * @Description
 */
@Service
@DS("slave_1")
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements ProductService {
}
