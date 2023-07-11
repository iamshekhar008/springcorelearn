package com.springcore.javaconfigr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component("obj")
public class student {
	private sam samo;
	//@Autowired
    public student(sam samo) {
		super();
		this.samo = samo;
	}
	public sam getSamo() {
		return samo;
	}
	public void setSamo(sam samo) {
		this.samo = samo;
	}
	public void disp() {
    	System.out.println("The student is studying...");
    }
}
