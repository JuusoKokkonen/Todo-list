package com.example.ToDolist.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Task {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long id;
	public String name, description, deadline;
	public boolean todo;
	
	public Task(Long id, String name, String description, String deadline, boolean status) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.deadline = deadline;
		this.todo = status;
	}

	public Task() {
		super();
		// TODO Auto-generated constructor stub
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDeadline() {
		return deadline;
	}

	public void setDeadline(String deadline) {
		this.deadline = deadline;
	}

	public boolean isTodo() {
		return todo;
	}

	public void setTodo(boolean todo) {
		this.todo = todo;
	}
	
	
}
