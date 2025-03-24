package com.test.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="practice")
public class SchoolEntity {

	@Id
	@GeneratedValue
	private int id;
	private String name;
	private int batch;
	private String city;
	public SchoolEntity() {
		
	}
	
	public SchoolEntity(int id, String name, int batch, String city) {
		
		this.id = id;
		this.name = name;
		this.batch = batch;
		this.city = city;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBatch() {
		return batch;
	}
	public void setBatch(int batch) {
		this.batch = batch;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "SchoolEntity [id=" + id + ", name=" + name + ", batch=" + batch + ", city=" + city + "]";
	}
	
	
}
