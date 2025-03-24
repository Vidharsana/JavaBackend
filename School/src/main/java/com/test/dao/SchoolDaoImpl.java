package com.test.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.test.entity.SchoolEntity;
import com.test.repository.SchoolRepository;


public class SchoolDaoImpl implements SchoolDao{

	@Autowired
	private SchoolRepository schlRepo;
	@Override
	public SchoolEntity createSchool(SchoolEntity schl) {
		return schlRepo.save(schl);
	}

	@Override
	public List<SchoolEntity> readSchool() {
		return schlRepo.findAll();
	}

	@Override
	public List<SchoolEntity> updateSchool(SchoolEntity schl) {
		schlRepo.save(schl);
		return schlRepo.findAll();
	}

	@Override
	public String deleteSchool(int ID) {
		schlRepo.deleteById(ID);
		return "deleted";
	}

}
