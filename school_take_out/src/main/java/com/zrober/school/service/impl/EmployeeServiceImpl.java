package com.zrober.school.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zrober.school.entity.Employee;
import com.zrober.school.mapper.EmployeeMapper;
import com.zrober.school.service.EmployeeService;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper,Employee> implements EmployeeService{
}
