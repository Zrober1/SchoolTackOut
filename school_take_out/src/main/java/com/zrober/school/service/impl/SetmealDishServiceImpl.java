package com.zrober.school.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zrober.school.entity.SetmealDish;
import com.zrober.school.mapper.SetmealDishMapper;
import com.zrober.school.service.SetmealDishService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class SetmealDishServiceImpl extends ServiceImpl<SetmealDishMapper,SetmealDish> implements SetmealDishService {
}
