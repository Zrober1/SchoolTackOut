package com.zrober.school.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zrober.school.entity.Category;

public interface CategoryService extends IService<Category> {

    public void remove(Long id);

}
