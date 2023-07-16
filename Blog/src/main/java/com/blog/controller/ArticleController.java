package com.blog.controller;

import com.blog.controller.data.Code;
import com.blog.entity.Article;
import com.blog.exception.BusinessException;
import com.blog.exception.SystemException;
import com.blog.service.ArticleService;
import com.blog.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Date;


@Controller
@SuppressWarnings("all")
@RequestMapping("/article")
@SessionAttributes(value = {"pageSize"})
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @Autowired
    private CommentService commentService;

    private static final Integer PAGE_COUNT = 10;


    @GetMapping("/list")
    public String index(Model model) throws Exception {
        try {
            Integer n = articleService.ids() / PAGE_COUNT;
            if (articleService.ids() % PAGE_COUNT > 0) n++;
            model.addAttribute("list", articleService.show(0, PAGE_COUNT));
            model.addAttribute("pageSize", n);
            Integer count = 1;
            model.addAttribute("count", count);
        }catch (Exception e) {
            throw new SystemException(Code.CSM_MSG, e, Code.CSM_ERR);
        }
        return "index";
    }

    @GetMapping("/del")
    public String del(Integer id) {
        try {
            commentService.delByForeignKey(id);
            articleService.deleteById(id);
        }catch (Exception e) {
            throw new BusinessException(Code.CSM_MSG, e, Code.CSM_ERR);
        }
        return "redirect:/article/list";
    }

    /**
     * 分页功能
     * @param id
     * @param model
     * @return
     */
    @GetMapping("/page")
    public String ids(Integer id, Model model) {
        // 页面起始
        Integer c = (id - 1) * 10;
        model.addAttribute("count",id);
        model.addAttribute("list", articleService.show(c, PAGE_COUNT));
        return "index";
    }

    /**
     * 批量删除
     * @param aid
     * @return
     */
    @PostMapping("/deletes")
    public String deletes(Integer[] aid) {
        try {
            commentService.dels(aid);
            articleService.deletes(aid);
        }catch (Exception e) {

        }
        return "redirect:/article/list";
    }
    @GetMapping("/add")
    public String add() {
        return "add";
    }

    @PostMapping("/add")
    public String add(Article article) {
        article.setTime(new Date());

        articleService.add(article);
        return "redirect:/article/list";
    }

    @GetMapping("/edit")
    public String edit(Model model, Integer id) {
        System.out.println("Id的值"+ id);
        System.out.println("控制层查到的数据"+articleService.selectById(id));
        Article article = articleService.selectById(id);
        model.addAttribute("databack", article);
        return "edit";
    }

    @PostMapping("/edit/update")
    public String edit(Article article) {

        if (article.getType() == 0) article.setType(1);
        article.setTime(new Date());
        System.out.println("获取的值："+article);
        articleService.edit(article);
        return "redirect:/article/list";
    }
}
