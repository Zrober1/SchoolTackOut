package com.zrober.school.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zrober.school.entity.AddressBook;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface AddressBookMapper extends BaseMapper<AddressBook> {

}
