package com.zrober.school.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zrober.school.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User>{
}
