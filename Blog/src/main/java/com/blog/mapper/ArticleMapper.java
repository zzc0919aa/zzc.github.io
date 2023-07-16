package com.blog.mapper;

import com.blog.entity.Article;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@SuppressWarnings("all")
public interface ArticleMapper {
    /**
     * 首页展示
     * @return
     */
    @Select("select * from Article")
    List<Article> list();

    /**
     * 根据Id删除
     * @param id
     * @return
     */
    @Delete("delete from Article where aid = #{id};")
    Integer deleteById(Integer id);

    /**
     * 分页查询
     * @param current
     * @param count
     * @return
     */
    @Select("select * from Article limit #{current}, #{count}")
    List<Article> show(@Param("current") Integer current, @Param("count") Integer count);

    /**
     * 获取总记录条数
     * @return
     */
    @Select("select count(*) from Article")
    Integer ids();

    boolean deletes(@Param("delByPrimary") Integer[] delByPrimary);

    @Insert("insert into article values (null, #{title}, #{author}, #{content}, #{time}, #{type})")
    public boolean add(Article article);

    boolean edit(Article article);

    @Select("select * from article where aid=#{id}")
    Article selectById(Integer id);
}
