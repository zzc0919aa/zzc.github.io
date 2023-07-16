package com.blog.service.impl;

import com.blog.entity.Article;
import com.blog.mapper.ArticleMapper;
import com.blog.service.ArticleService;
import com.sun.org.apache.xpath.internal.operations.Bool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@SuppressWarnings("all")
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private ArticleMapper articleMapper;

    @Override
    public List<Article> list() {
        return articleMapper.list();
    }

    @Override
    public Boolean deleteById(Integer id) {

        return articleMapper.deleteById(id) > 0;
    }

    @Override
    public Integer ids() {
        return articleMapper.ids();
    }

    @Override
    public List<Article> show(Integer current, Integer count) {

        return articleMapper.show(current, count);
    }

    @Override
    public boolean deletes(Integer[] idarrs) {
        return articleMapper.deletes(idarrs);
    }

    public void add(Article article) {
        articleMapper.add(article);
    }

    @Override
    public boolean edit(Article article) {
        return articleMapper.edit(article);
    }

    @Override
    public Article selectById(Integer id) {

        return articleMapper.selectById(id);
    }
}
