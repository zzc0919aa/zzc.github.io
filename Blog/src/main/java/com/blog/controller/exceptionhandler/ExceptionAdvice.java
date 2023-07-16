package com.blog.controller.exceptionhandler;

import com.blog.exception.BusinessException;
import com.blog.exception.SystemException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class ExceptionAdvice {
    /**
     * 处理系统异常
     * @param ex
     * @return
     */
    @ExceptionHandler(SystemException.class)
    public ModelAndView doSystemException(SystemException ex) {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("redirect:/error");
        mv.addObject("message", ex.getMessage());
        return mv;
    }

    /**
     * 处理业务异常
     * @param ex
     * @return
     */
    @ExceptionHandler(BusinessException.class)
    public ModelAndView doBusinessException(BusinessException ex) {
        ModelAndView mv= new ModelAndView();
        mv.setViewName("redirect:/error");
        mv.addObject("message", ex.getMessage());
        return mv;
    }

    /**
     * 处理未知异常
     * @param ex
     * @return
     */
    @ExceptionHandler(Exception.class)
    public ModelAndView doException(Exception ex) {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("redirect:/error");
        mv.addObject("message", ex.getMessage());
        return mv;
    }
}
