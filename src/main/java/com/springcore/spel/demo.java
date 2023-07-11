package com.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("d")
public class demo {
	@Value("#{4+3+5+1}")
    private int a;
	
	@Value("#{T(java.lang.Math).sqrt(25)}")
    private double srt;
	
	@Value("#{T(java.lang.Math).PI}")
    private double pi;
	
	@Value("#{new java.lang.String('hello')}")
    private String msg;
	
	@Value("#{8>2}")
    private boolean x;
	
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public double getSrt() {
		return srt;
	}
	public void setSrt(double srt) {
		this.srt = srt;
	}
	public double getPi() {
		return pi;
	}
	public void setPi(double pi) {
		this.pi = pi;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public boolean isX() {
		return x;
	}
	public void setX(boolean x) {
		this.x = x;
	}
	@Override
	public String toString() {
		return "demo [a=" + a + ", srt=" + srt + ", pi=" + pi + ", msg=" + msg + ", x=" + x + "]";
	}
	
	
}
