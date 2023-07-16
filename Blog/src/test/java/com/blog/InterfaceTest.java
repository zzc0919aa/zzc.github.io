package com.blog;

import com.blog.config.SpringConfig;
import com.blog.entity.Article;
import com.blog.mapper.ArticleMapper;
import com.blog.mapper.CommentMapper;
import com.blog.mapper.MessageMapper;
import com.blog.mapper.UserMapper;
import com.blog.service.ArticleService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
@SuppressWarnings("all")
public class InterfaceTest {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private ArticleMapper articleMapper;

    @Autowired
    private ArticleService articleService;

    @Autowired
    private MessageMapper messageMapper;

    @Autowired
    private CommentMapper commentMapper;


    @Test
    public void list() {
        System.out.println(articleMapper.list());
    }

    private static final Integer PAGE_COUNT = 10;
    @Test
    public void shwo() {
        Integer pageNumber = 3;

        Integer current = (pageNumber - 1) * PAGE_COUNT;
        Integer count = pageNumber * PAGE_COUNT;
        System.out.println(articleMapper.show(current, count));
    }

    @Test
    public void login() {
        String email = "yyy123@163.com";
        String password = "yyy123";
        System.out.println(userMapper.login(email, password));
    }

    @Test
    public void ids() {
        System.out.println("数据条数：" +articleMapper.ids());
    }

    @Test
    public void t2() {
        Integer ids = articleService.ids();
        Integer number = 0;
        if (ids / PAGE_COUNT > 0) number = 1;
        if (ids % 10 > 0) number++;

        System.out.println(number);
    }

    @Test
    public void t3() {
        Integer c = (2 - 1) * 10;
        System.out.println(articleService.show(c, PAGE_COUNT));
    }

    @Test
    public void t4() {
        System.out.println(articleService.ids());
        Integer n = 20 / PAGE_COUNT;
        if (articleService.ids() % PAGE_COUNT > 0) n++;
    }


    @Test
    public void t5() {
        System.out.println("===========================================");
        System.out.println("内容");
        System.out.println(messageMapper.msgList());
        System.out.println("===========================================");
    }

    @Test
    public void t6() {
        System.out.println("===========================================");
        System.out.println("内容");
        System.out.println(commentMapper.dels(new Integer[]{1, 2, 4}));
        System.out.println("===========================================");
    }

    @Test
    public void t7() {
        Article a = new Article(null, "ss", "sss", "sss", new Date(), 1);
        System.out.println(articleMapper.add(a));
    }

    @Test
    public void edit() {
        boolean edit = articleMapper.edit(new Article(206, "哇哇哇哇", "askdhujaklsdhs", "sadjkaslkd", new Date(), 7));
        System.out.println(edit);
    }

    @Test
    public void selectById() {
        System.out.println(articleMapper.selectById(206));
    }


    @Test
    public void t8() {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        System.out.println(ctx.getBean("dataSource"));
    }

}
