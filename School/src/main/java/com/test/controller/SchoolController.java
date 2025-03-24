package com.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.entity.SchoolEntity;
import com.test.service.SchoolService;

@RestController
@RequestMapping("/school")

public class SchoolController {

	@Autowired
	private SchoolService service;
	
	@PostMapping("/create")
	public List<SchoolEntity> createSchool(@RequestBody SchoolEntity entity){
		service.createSchool(entity);
		return service.readSchool();
	}
	
	@PutMapping("/update/{ID}")
	public List<SchoolEntity> updateSchool(@RequestBody SchoolEntity entity,@PathVariable("ID")int id){
		entity.setId(id);
		service.updateSchool(entity);
		return service.readSchool();
	}
	
	@GetMapping("/read")
	public List<SchoolEntity> readSchool(){
		return service.readSchool();
	}
	
	@DeleteMapping("/delete{ID}")
	public List<SchoolEntity> deleteSchool(@PathVariable("ID")int id){
		service.deleteSchool(id);
		return service.readSchool();
	}
}
