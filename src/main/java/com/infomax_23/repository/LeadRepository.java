package com.infomax_23.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.infomax_23.entity.Lead;

public interface LeadRepository extends JpaRepository<Lead, Long>{

}
