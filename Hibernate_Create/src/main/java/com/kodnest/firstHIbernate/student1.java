package com.kodnest.firstHIbernate;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "kodnest")
@Entity //to map with the table in db with the data we give from object
//class name and table name has to be same
public class student1{
	@Column
	String name;
	@Id
	int id;
	
	@Column(name="password")
	int pwd;
	
	@Column
	int marks;
	public student1(int id, int pwd, String name, int marks) {
		super();
		this.name = name;
		this.id = id;
		this.pwd = pwd;
		this.marks = marks;
	}
}
