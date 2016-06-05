package com.learn.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

/**
 * Created by Erin on 6/3/16.
 */
@Entity
public class AssignProjectToStaff extends BaseObject{

    @ManyToOne
    private Staff staff;

    @ManyToOne
    private Project project;

    public Staff getStaff() {
        return staff;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

}
