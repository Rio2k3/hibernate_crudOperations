package com.kodnest.FourthHibernate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="kodnest")
public class student {
	@Id
	@Column
int id;
	@Column
String name;
	@Column
int marks;
	@Column
String password;
	
public student(int id, String name, int marks, String password) {
	super();
	this.id = id;
	this.name = name;
	this.marks = marks;
	this.password = password;
}
public student() {
	// TODO Auto-generated constructor stub
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
public int getMarks() {
	return marks;
}
public void setMarks(int marks) {
	this.marks = marks;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
@Override
public String toString() {
	return "student [id=" + id + ", name=" + name + ", marks=" + marks + ", password=" + password + "]";
}

}
