package com.learn.repository;

import com.learn.model.Plan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Date;

/**
 * Created by Erin on 6/4/16.
 */
@Repository
public interface PlanRepo extends JpaRepository<Plan, Long>{

    @Query("SELECT p.id FROM Plan p WHERE p.staff.id=?1 AND p.date=?2")
    public Long findPlanIdByStaffIdAndDate(Long id, Date date);
}
