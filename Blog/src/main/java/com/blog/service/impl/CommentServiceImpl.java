package com.blog.service.impl;

import com.blog.mapper.CommentMapper;
import com.blog.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@SuppressWarnings("all")
public class CommentServiceImpl implements CommentService {

    @Autowired
    private CommentMapper commentMapper;

    @Override
    public boolean dels(Integer[] arrids) {
        return commentMapper.dels(arrids);
    }

    @Override
    public boolean delByForeignKey(Integer id) {
        return commentMapper.delByForeignKey(id);
    }
}
