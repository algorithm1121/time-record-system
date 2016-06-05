package com.learn.controller;


import com.alibaba.fastjson.JSON;
import com.learn.controller.viewmodel.ResponseJson;
import com.learn.model.Staff;
import com.learn.repository.StaffRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Erin on 6/2/16.
 */

@Controller
public class HelloWorldController {

    @Autowired
    StaffRepo StaffRepo;


    @RequestMapping(value = "hello")
    @ResponseBody
    public String hello(String name) {

        List<Staff> staffs = new ArrayList<Staff>();

        Staff s1 = new Staff();
        s1.setName(name);
        staffs.add(s1);
        return JSON.toJSONString(staffs);
        return JSON.toJSONString(ResponseJson.ok("save success"));
    }

    //得到属性值保存到表

}
