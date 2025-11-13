package com.kodnest.secondHibernate;
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
	public student1() {
		super();    //for hibernate 
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPwd() {
		return pwd;
	}
	public void setPwd(int pwd) {
		this.pwd = pwd;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String toString()
	{
		return "id: "+this.id+ " name : "+this.name+" marks: " + this.marks+" pwd: "+ this.pwd;
	}
}
