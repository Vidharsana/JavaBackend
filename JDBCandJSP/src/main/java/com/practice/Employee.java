package com.practice;

import java.util.Objects;

public class Employee {

	private int id;
	private String name;
	private String email;
	private int phoneNo;
	private int yoj;
	public Employee(int id, String name, String email, int phoneNo, int yoj) {
		
		this.id = id;
		this.name = name;
		this.email = email;
		this.phoneNo = phoneNo;
		this.yoj = yoj;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(int phoneNo) {
		this.phoneNo = phoneNo;
	}
	public int getYoj() {
		return yoj;
	}
	public void setYoj(int yoj) {
		this.yoj = yoj;
	}
	@Override
	public int hashCode() {
		return Objects.hash(email, id, name, phoneNo, yoj);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(email, other.email) && id == other.id && Objects.equals(name, other.name)
				&& phoneNo == other.phoneNo && yoj == other.yoj;
	}
	
}
