package com.blog.mapper;

import com.blog.entity.Message;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@SuppressWarnings("all")
public interface MessageMapper {

    @Select("select * from message")
    List<Message> msgList();

    public boolean dels();

}
