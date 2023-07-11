package com.springcore.practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class mainf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext con=new ClassPathXmlApplicationContext("com/springcore/practice/config.xml");
	employee e = con.getBean("e1",employee.class);
	System.out.println(e.getDept());
	}

}
