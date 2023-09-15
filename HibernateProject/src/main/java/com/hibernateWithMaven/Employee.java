package com.hibernateWithMaven;

import javax.persistence.Entity;
import javax.persistence.Id;

//POJO Class = plain old java object --> class with logic
@Entity
public class Employee {
	@Id
	int id;
	String name;
	String designation;

	
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
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	
	public Employee() {
		super();
	}
	
	public Employee(int id, String name, String designation) {
		this.id = id;
		this.name = name;
		this.designation = designation;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", designation=" + designation + "]";
	}
	

}
