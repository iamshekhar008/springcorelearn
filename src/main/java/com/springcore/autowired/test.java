package com.springcore.autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
	ApplicationContext context=	new ClassPathXmlApplicationContext("com/springcore/autowired/config.xml");
	//emp e=(emp)context.getBean("e1");
	emp e=context.getBean("e1",emp.class);  //no need to typecast
	System.out.println(e);

	}

}
