package com.learn.repository;

import  com.learn.model.Staff;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Erin on 6/3/16.
 */
@Repository
public interface StaffRepo extends JpaRepository<Staff,Long> {

    @Query("SELECT s from Staff s Where s.name = ?1" )
    public List<Staff> findByStaffName(String staffName);

    @Query("SELECT s FROM Staff s WHERE s.superior_id = ?1")
    public List<Staff> findStaffBySuperior(Long superiorId);
}
