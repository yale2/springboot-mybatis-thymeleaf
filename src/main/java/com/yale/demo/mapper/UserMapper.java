package com.yale.demo.mapper;

import com.yale.demo.entity.User;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {

    @Select("select * from user where id=#{id}")
    User selectById(Long id);
}
