package com.zrober.school.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zrober.school.entity.OrderDetail;
import com.zrober.school.mapper.OrderDetailMapper;
import com.zrober.school.service.OrderDetailService;
import org.springframework.stereotype.Service;

@Service
public class OrderDetailServiceImpl extends ServiceImpl<OrderDetailMapper, OrderDetail> implements OrderDetailService {

}