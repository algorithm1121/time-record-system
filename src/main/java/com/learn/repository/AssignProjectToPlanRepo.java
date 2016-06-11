package com.learn.repository;

import com.learn.model.AssignProjectToPlan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Erin on 6/4/16.
 */
@Repository
public interface AssignProjectToPlanRepo extends JpaRepository<AssignProjectToPlan, Long> {


}
