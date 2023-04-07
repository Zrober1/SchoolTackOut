package com.zrober.school.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zrober.school.entity.Dish;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DishMapper extends BaseMapper<Dish> {
}
