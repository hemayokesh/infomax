package com.infomax_23.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.infomax_23.entity.Contact;

public interface ContactRepository extends JpaRepository<Contact, Long> {

}
