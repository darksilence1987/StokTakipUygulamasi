package com.xhite.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(MicroServiceExceptionManager.class)
    @ResponseBody
    public ModelAndView handleRuntimeException(MicroServiceExceptionManager exception){
        ModelAndView errorView = new ModelAndView("error");
        errorView.addObject("exception",exception);
        return errorView;
    }
}