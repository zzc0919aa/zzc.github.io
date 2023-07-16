package com.blog.service;

@SuppressWarnings("all")
public interface CommentService {

    boolean dels(Integer[] arrids);

    boolean delByForeignKey(Integer id);
}
