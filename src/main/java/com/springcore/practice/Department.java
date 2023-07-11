package com.springcore.practice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("dept")
public class Department {
	@Override
	public String toString() {
		return "Department [dept=" + dept + ", prio=" + prio + "]";
	}
	@Value("BackDev")
    private String dept;
    public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	@Value("1")
	private int prio;
	public int getPrio() {
		return prio;
	}
	public void setPrio(int prio) {
		this.prio = prio;
	}
}
