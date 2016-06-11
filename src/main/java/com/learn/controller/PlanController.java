package com.learn.controller;

import com.alibaba.fastjson.JSON;
import com.learn.controller.viewmodel.ResponseJson;
import com.learn.model.AssignProjectToPlan;
import com.learn.model.Plan;
import com.learn.model.Project;
import com.learn.model.Staff;
import com.learn.repository.AssignProjectToPlanRepo;
import com.learn.repository.StaffRepo;
import javafx.scene.input.DataFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.learn.repository.PlanRepo;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.DoubleSummaryStatistics;
import java.util.List;

/**
 * Created by Erin on 6/10/16.
 */
@Controller
public class PlanController {

    @Autowired
    com.learn.repository.PlanRepo planRepo;

    @Autowired
    com.learn.repository.ProjectRepo projectRepo;

    @Autowired
    com.learn.repository.AssignProjectToPlanRepo assignProjectToPlanRepo;

    @Autowired
    com.learn.repository.StaffRepo staffRepo;

    @RequestMapping(value = "todayPlan")
    @ResponseBody
    public ResponseJson todayPlan(String totalWorkHours, String projectIds, String date){

        //Create a plan, set the total work hours and date
        Plan plan = new Plan();
        plan.setTodaySpendHours(Double.parseDouble(totalWorkHours));
        DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
        Date todayDate = new Date();
        try{
             todayDate = df.parse(date);

        }catch (ParseException e){

            e.printStackTrace();
        }
        plan.setDate(todayDate);
        planRepo.save(plan);

        char[] idCharacters = projectIds.toCharArray();

        //create assignProjectToPlan objects for every element in projectIdS

        int i = 0;
        while(i < idCharacters.length) {

            AssignProjectToPlan assignProjectToPlan = new AssignProjectToPlan();
            assignProjectToPlan.setProject(projectRepo.findOne(Long.parseLong(Character.toString(idCharacters[i]))));
            assignProjectToPlan.setPlan(plan);
            assignProjectToPlanRepo.save(assignProjectToPlan);
            i++;

        }

        return ResponseJson.ok("OK");
    }

    @RequestMapping(value = "subordinate")
    @ResponseBody
    public String subordinate(String id, String date){

        Long[] ids = staffRepo.findStaffBySuperior(Long.parseLong(id));
        List<Long> planIds = new ArrayList<Long>();

        //Convert string to date type
        DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
        Date todayDate = new Date();
        try{
            todayDate = df.parse(date);

        }catch (ParseException e){

            e.printStackTrace();
        }


        for(int i = 0; i < ids.length; i++){

            Long planId = planRepo.findPlanIdByStaffIdAndDate(ids[i], todayDate);
            planIds.add(planId);
        }

        return JSON.toJSONString(planIds);
    }

}
