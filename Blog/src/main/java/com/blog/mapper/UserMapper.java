package com.blog.mapper;

import com.blog.entity.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;


public interface UserMapper {

    /**
     * 普通用户登录
     * @param email
     * @param password
     * @return
     */
    @Select("select * from `User` where email = #{email} and `password` = #{password}")
    User login(@Param("email") String email, @Param("password") String password);
}
