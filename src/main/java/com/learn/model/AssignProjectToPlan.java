package com.learn.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

/**
 * Created by Erin on 6/3/16.
 */
@Entity
public class AssignProjectToPlan extends BaseObject{

    @ManyToOne
    private Plan plan;

    @ManyToOne
    private Project project;



    public Plan getPlan() {
        return plan;
    }

    public void setPlan(Plan plan) {
        this.plan = plan;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }





}
