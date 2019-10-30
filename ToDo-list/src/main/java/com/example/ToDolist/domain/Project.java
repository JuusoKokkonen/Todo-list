package com.example.ToDolist.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Project {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long id;
	public String name, owner;
	
	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Project(Long id, String name, String owner) {
		super();
		this.id = id;
		this.name = name;
		this.owner = owner;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	@Override
	public String toString() {
		return "Project [id=" + id + ", name=" + name + ", owner=" + owner + "]";
	}
	
	
	
}
