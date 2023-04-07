package com.zrober.school.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zrober.school.entity.ShoppingCart;
import com.zrober.school.mapper.ShoppingCartMapper;
import com.zrober.school.service.ShoppingCartService;
import org.springframework.stereotype.Service;

@Service
public class ShoppingCartServiceImpl extends ServiceImpl<ShoppingCartMapper, ShoppingCart> implements ShoppingCartService {

}
