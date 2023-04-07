package com.zrober.school.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zrober.school.entity.Employee;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface EmployeeMapper extends BaseMapper<Employee>{
}
