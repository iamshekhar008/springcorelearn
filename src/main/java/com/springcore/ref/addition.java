package com.springcore.ref;

public class addition {
  private int a;
  private int b;
  addition(int a,int b){
	  System.out.println("int int is called..");
	  this.a=a;
	  this.b=b;
  }
  addition(double a,double b){
	  System.out.println("double double is called..");
	  this.a=(int)a;
	  this.b=(int)b;
  }
  
  public double dosum() {
	  System.out.println("value of a: "+this.a);
	  System.out.println("value of b: "+this.b);
	  System.out.println("sum is:");
	  return this.a+this.b;
  }
}
