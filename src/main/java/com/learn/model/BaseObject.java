package com.learn.model;

import javax.persistence.GeneratedValue;
import javax.persistence.IdClass;
import javax.persistence.MappedSuperclass;
import javax.persistence.Id;
/**
 * Created by Erin on 6/4/16.
 */

@MappedSuperclass
public class BaseObject {

    @Id
    @GeneratedValue
    private Long id;
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }



}
