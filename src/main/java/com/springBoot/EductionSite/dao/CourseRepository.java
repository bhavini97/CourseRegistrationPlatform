package com.springBoot.EductionSite.dao;

import com.springBoot.EductionSite.Entity.courseData;
import org.springframework.data.jpa.repository.JpaRepository;



public interface CourseRepository extends JpaRepository<courseData,Integer> {

}
