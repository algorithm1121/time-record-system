package com.learn.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Erin on 6/2/16.
 */

@Controller
public class HelloWorldController {

    @RequestMapping(value = "hello")
    public String hello(){

        return "hello";
    }
}
