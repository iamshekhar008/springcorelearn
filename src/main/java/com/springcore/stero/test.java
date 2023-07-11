package com.springcore.stero;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/stero/config.xml");
       Student ob=context.getBean("ob",Student.class);
       System.out.println(ob.getUnits());
	}

}
