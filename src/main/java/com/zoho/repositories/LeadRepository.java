package com.zoho.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zoho.entities.Lead;

public interface LeadRepository extends JpaRepository<Lead, Long> {

}
