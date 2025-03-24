package com.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.entity.SchoolEntity;
@Repository
public interface SchoolRepository extends JpaRepository<SchoolEntity, Integer>{

	
}
