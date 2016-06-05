package com.learn.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import java.util.Date;
import java.util.List;

/**
 * Created by Erin on 6/3/16.
 */
@Entity
public class Plan extends BaseObject{

    public enum Status{

        processing, approved, rejected
    }

    private Date date;
    private String todayToDoList;
    private Status status;
    private String comment;
    private double todaySpendHours;

    @OneToOne
    private Staff superior;

    @ManyToOne
    private Staff staff;

    public Staff getSuperior() {
        return superior;
    }

    public void setSuperior(Staff superior) {
        this.superior = superior;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTodayToDoList() {
        return todayToDoList;
    }

    public void setTodayToDoList(String todayToDoList) {
        this.todayToDoList = todayToDoList;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public double getTodaySpendHours() {
        return todaySpendHours;
    }

    public void setTodaySpendHours(double todaySpendHours) {
        this.todaySpendHours = todaySpendHours;
    }

    public Staff getStaff() {
        return staff;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }





}
