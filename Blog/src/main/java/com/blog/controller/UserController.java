package com.blog.controller;

import com.blog.entity.User;
import com.blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;


@Controller
@SuppressWarnings("all")
@SessionAttributes(value = {"loginOK", "userId", "userName"})
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String login() {
        return "login";
    }

    @PostMapping("/user/login")
    public String login(Model model, String email, String password) {
        User login = userService.login(email, password);
        try {
            model.addAttribute("loginOK", "OK");
            model.addAttribute("userId", login.getUid());
            model.addAttribute("userName", login.getUname());
        }catch (Exception e) {
            model.addAttribute("message", "邮箱或密码错误，请重新输入。");
            return "redirect:/";
        }
        return "redirect:/article/list";
    }
}
