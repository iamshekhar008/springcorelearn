package com.springcore.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class emp {

	@Autowired
	@Qualifier("add2")
   private adress add;

public adress getAdd() {
	return add;
}

public void setAdd(adress add) {
	this.add = add;
}

public emp() {
	super();
	// TODO Auto-generated constructor stub
}

public emp(adress add) {
	super();
	this.add = add;
}

@Override
public String toString() {
	return "emp [add=" + add + "]";
}


   
}
