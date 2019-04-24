package com.supratim.jpapractice.jpapractice;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

@Entity
public class Student {
	
	@GeneratedValue
	@javax.persistence.Id
	private long Id;
	private String name;
	private String standard;
	public long getId() {
		return Id;
	}
	@Override
	public String toString() {
		return "Student [Id=" + Id + ", name=" + name + ", standard=" + standard + ", roll=" + roll + "]";
	}
	public void setId(long id) {
		Id = id;
	}
	public Student() {
		super();
	}
	public Student(String name, String standard, Long roll) {
		super();
		this.name = name;
		this.standard = standard;
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStandard() {
		return standard;
	}
	public void setStandard(String standard) {
		this.standard = standard;
	}
	public Long getRoll() {
		return roll;
	}
	public void setRoll(Long roll) {
		this.roll = roll;
	}
	private Long roll;


}
