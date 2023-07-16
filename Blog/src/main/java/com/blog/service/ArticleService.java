package com.blog.service;

import com.blog.entity.Article;
import com.sun.org.apache.xpath.internal.operations.Bool;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ArticleService {
    List<Article> list();

    Boolean deleteById(Integer id);

    Integer ids();

    List<Article> show(Integer current, Integer count);

    boolean deletes(Integer[] idarrs);

    void add(Article article);

    boolean edit(Article article);

    Article selectById(Integer id);
}
