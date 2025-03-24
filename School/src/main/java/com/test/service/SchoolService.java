package com.test.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.test.entity.SchoolEntity;
@Service
public interface SchoolService {

	public SchoolEntity createSchool(SchoolEntity schl);
	public List<SchoolEntity> readSchool();
	public SchoolEntity updateSchool(SchoolEntity schl);
	public String deleteSchool(int ID);
}
