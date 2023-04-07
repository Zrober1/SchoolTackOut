package com.zrober.school.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zrober.school.entity.User;
import com.zrober.school.mapper.UserMapper;
import com.zrober.school.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper,User> implements UserService{
}
