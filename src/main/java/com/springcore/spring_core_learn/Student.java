package com.springcore.spring_core_learn;

public class Student {
  private int roll;
  private String name;
  private String address;
public int getRoll() {
	return roll;
}
public void setRoll(int roll) {
	this.roll = roll;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
public Student(int roll, String name, String address) {
	super();
	this.roll = roll;
	this.name = name;
	this.address = address;
}
@Override
public String toString() {
	return "Student [roll=" + roll + ", name=" + name + ", address=" + address + "]";
}
  
  
}
