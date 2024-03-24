package com.springBoot.EductionSite.dao;

import com.springBoot.EductionSite.Entity.contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepo extends JpaRepository<contact, Integer> {


}
