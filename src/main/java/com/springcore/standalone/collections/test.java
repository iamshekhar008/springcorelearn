package com.springcore.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ApplicationContext context= new  ClassPathXmlApplicationContext("com/springcore/standalone/collections/config.xml");
       person p1=context.getBean("per1",person.class);
       System.out.println(p1.getFriends());
	}

}
