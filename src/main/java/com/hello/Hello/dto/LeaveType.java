package com.hello.Hello.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class LeaveType {

	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private String code;
	private String description;

	public LeaveType() {
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

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LeaveType(Long id, String name, String code, String description) {
		super();
		this.id = id;
		this.name = name;
		this.code = code;
		this.description = description;
	}

	@Override
	public String toString() {
		return "LeaveType [id=" + id + ", name=" + name + ", code=" + code + ", description=" + description + "]";
	}

}
