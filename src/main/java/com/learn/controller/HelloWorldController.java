package com.learn.controller;


import com.alibaba.fastjson.JSON;
import com.learn.controller.viewmodel.ResponseJson;
import com.learn.model.Project;
import com.learn.model.Staff;
import com.learn.repository.ProjectRepo;
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

    @Autowired
    ProjectRepo ProjectRepo;

    @RequestMapping(value = "hello")
    @ResponseBody
    public ResponseJson hello(String projectName) {

        /*
        List<Staff> staffs = new ArrayList<Staff>();

        Staff s1 = new Staff();
        s1.setName(name);
        s1.setPassword(password);
        staffs.add(s1);
        return JSON.toJSONString(staffs);
        */
        //Staff staff = StaffRepo.findStaffByName(name);
        Project project = new Project();
        project.setProjectName(projectName);
        ProjectRepo.save(project);



        return ResponseJson.ok("OK");

    }


}
