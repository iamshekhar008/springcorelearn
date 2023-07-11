package com.springcore.stero;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("ob")
public class Student {
	@Value("Shashank")
  private String name;
	@Value("pune")
  private String city;
	@Value("#{temp}")
  private List<String> units;	
public List<String> getUnits() {
	return units;
}
public void setUnits(List<String> units) {
	this.units = units;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
@Override
public String toString() {
	return "Student [name=" + name + ", city=" + city + "]";
}
  
  
  
}
