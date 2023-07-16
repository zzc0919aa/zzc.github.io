package com.blog.mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@SuppressWarnings("all")
public interface CommentMapper {

    public boolean dels(@Param("arrids") Integer[] arrids);

    @Delete("delete from comment where aid = #{id}")
    boolean delByForeignKey(@Param("id") Integer id);

}
