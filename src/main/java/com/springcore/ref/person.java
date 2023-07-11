package com.springcore.ref;

public class person {
   private int id;
   private String name;
   private certi cer;
   person(int id,String name,certi cer){
	   this.id=id;
	   this.name=name;
	   this.cer=cer;
   }
@Override
public String toString() {
	return "[id=" + id + ", name=" + name + ", cer=" + cer + "]";
}
   
}
