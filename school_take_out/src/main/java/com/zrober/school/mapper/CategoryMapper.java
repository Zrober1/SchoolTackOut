package com.zrober.school.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zrober.school.entity.Category;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CategoryMapper extends BaseMapper<Category> {
}
