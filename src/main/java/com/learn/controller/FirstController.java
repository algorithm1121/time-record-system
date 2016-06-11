package com.learn.controller;

import com.learn.controller.viewmodel.ResponseJson;
import com.learn.model.Staff;
import com.learn.repository.StaffRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Erin on 6/9/16.
 */
@Controller
public class FirstController {

    @Autowired
    com.learn.repository.StaffRepo StaffRepo;

    @RequestMapping(value = "login")
    @ResponseBody
    public Boolean login(String userId, String password){

        Staff staff = StaffRepo.findOne(Long.parseLong(userId.trim()));
        if(staff == null){

            return false;
        }
        if(staff.getPassword().equals(password) == true){

            return true;
        }
        return false;
    }
}
