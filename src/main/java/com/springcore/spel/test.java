package com.springcore.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          ApplicationContext con=new ClassPathXmlApplicationContext("com/springcore/spel/config.xml");
          demo d1=con.getBean("d",demo.class);
          System.out.println(d1);
          
          
	}

}
