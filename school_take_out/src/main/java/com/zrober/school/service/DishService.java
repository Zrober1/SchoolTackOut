package com.zrober.school.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zrober.school.dto.DishDto;
import com.zrober.school.entity.Dish;

import java.util.List;

public interface DishService extends IService<Dish> {

    //新增菜品，同时插入菜品对应的口味数据，需要操作两张表：dish、dish_flavor
    public void saveWithFlavor(DishDto dishDto);

    //根据id查询菜品信息和对应的口味信息
    public DishDto getByIdWithFlavor(Long id);

    //更新菜品信息，同时更新对应的口味信息
    public void updateWithFlavor(DishDto dishDto);

    public void updateStatus(Long id, Integer status);

    public void removeWithDish(List<Long> ids);
}
