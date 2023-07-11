package com.springcore.practice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("e1")
public class employee {
	@Value("Ramesh")
    private String name;
	@Value("SWE")
    private String post;
	@Value("77800")
    private int salary;
    
	@Autowired
   Department dept;
	
	@Value("#{temp}")
    private List<Integer> phones;

	public List<Integer> getPhones() {
		return phones;
	}

	public void setPhones(List<Integer> phones) {
		this.phones = phones;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPost() {
		return post;
	}

	public void setPost(String post) {
		this.post = post;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
//
	public Department getDept() {
	return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}
//    
    
    
}
