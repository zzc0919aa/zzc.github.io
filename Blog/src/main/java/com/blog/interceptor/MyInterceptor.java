package com.blog.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Object loginOK = request.getSession().getAttribute("loginOK");
        if (loginOK == null) response.sendRedirect("/");
        System.out.println("====================================================");
        System.out.println("执行preHandle");
        System.out.println("====================================================");
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("====================================================");
        System.out.println("执行postHandle");
        System.out.println("====================================================");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("====================================================");
        System.out.println("执行afterCompletion");
        System.out.println("====================================================");
    }
}
