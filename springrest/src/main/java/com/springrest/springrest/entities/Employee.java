package com.springrest.springrest.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;




@Entity
public class Employee {
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Id
	private long id;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	private String name;
	
	private String description;

	public Employee(long id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
	}

}
