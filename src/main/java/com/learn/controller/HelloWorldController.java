package com.learn.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Erin on 6/2/16.
 */

@Controller
public class HelloWorldController {

    @RequestMapping(value = "hello")
    public ModelAndView hello(String name, ModelAndView modelAndView){

        modelAndView.addObject("name", name);
        modelAndView.setViewName("hello");
        return modelAndView;
    }
}
