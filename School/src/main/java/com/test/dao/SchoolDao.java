package com.test.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.test.entity.SchoolEntity;
@Repository
public interface SchoolDao {

	public SchoolEntity createSchool(SchoolEntity schl);
	public List<SchoolEntity> readSchool();
	public List<SchoolEntity> updateSchool(SchoolEntity schl);
	public String deleteSchool(int ID);
}
