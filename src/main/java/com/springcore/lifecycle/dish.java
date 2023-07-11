package com.springcore.lifecycle;

public class dish {
    private int price;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "dish [price=" + price + "]";
	}
    
	public void init() {
		System.out.println("init is called..");
	}
	public void destroy() {
		System.out.println("destroy is called..");
	}
}
