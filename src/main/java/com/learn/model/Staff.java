package com.learn.model;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import java.util.List;

/**
 * Created by Erin on 6/3/16.
 */
@Entity
public class Staff extends BaseObject{


    private String name;
    private String password;
    private String SSN;
    private String address;
    private String phone;
    private String email;
    //select * from staff where superior.name = ?
    @OneToOne
    private Staff superior;




    public Staff getSuperior() {
        return superior;
    }

    public void setSuperior(Staff superior) {
        this.superior = superior;
    }



    public String getSSN() {
        return SSN;
    }

    public void setSSN(String SSN) {
        this.SSN = SSN;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }



}
