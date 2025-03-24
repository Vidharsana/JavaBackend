package com.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.test.dao.SchoolDao;
import com.test.entity.SchoolEntity;

public class SchoolServiceImpl implements SchoolService{

	@Autowired
	private SchoolDao schldao;

	@Override
	public SchoolEntity createSchool(SchoolEntity schl) {
		
		return schldao.createSchool(schl);
	}

	@Override
	public List<SchoolEntity> readSchool() {
		
		return schldao.readSchool();
	}

	@Override
	public SchoolEntity updateSchool(SchoolEntity schl) {
		
		return schldao.createSchool(schl);
	}

	@Override
	public String deleteSchool(int id) {
		schldao.deleteSchool(id);
		return "done";
	}
	
}
