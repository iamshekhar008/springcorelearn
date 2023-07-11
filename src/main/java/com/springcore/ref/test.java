package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/ref/refconfig.xml");
//           A a=(A)context.getBean("aref");
//          System.out.println(a.getX1());
//          System.out.println(a.getOb());
//           person p=(person)context.getBean("p1");
//           System.out.println(p);
           
           addition ad=(addition)context.getBean("add1");
           System.out.println(ad.dosum());
	}

}
