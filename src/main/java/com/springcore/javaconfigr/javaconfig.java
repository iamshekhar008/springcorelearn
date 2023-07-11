package com.springcore.javaconfigr;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages="com.springcore.javaconfigr")
public class javaconfig {
  @Bean	
  public sam getsam() {
	  return new sam();
  }
  @Bean	
  public student getStudent() {
	  return new student(getsam());
  }
}
