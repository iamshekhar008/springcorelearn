package com.springcore.javaconfigr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class test {
public static void main(String[] args) {
	ApplicationContext con=new AnnotationConfigApplicationContext(javaconfig.class);
	student s=con.getBean("getStudent",student.class);
	s.disp();
	s.getSamo().d();
}
}
