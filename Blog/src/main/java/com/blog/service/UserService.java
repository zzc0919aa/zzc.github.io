package com.blog.service;

import com.blog.entity.User;
import org.apache.ibatis.annotations.Param;

public interface UserService {
    User login(String email, String password);
}
