package com.learn.model;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import java.util.Date;

/**
 * Created by Erin on 6/3/16.
 */
@Entity
public class Project extends BaseObject {

    private String projectName;
    private Date startDate;
    private Date endDate;

    @OneToOne
    private Staff Manager;

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Staff getManager() {
        return Manager;
    }

    public void setManager(Staff manager) {
        Manager = manager;
    }



}
