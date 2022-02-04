package com.scb.springtest;

public class Calculater {
	
	public String name;
	public int p;
	
	public Calculater(String na,int b) {
		this.name=na;
		this.p=b;
		
		System.out.println("calculator object is created");
	}
	
	/*
	 * public String getName() { return name; } public void setName(String name) {
	 * this.name = name; }
	 */
	
	public void add(int x,int y) {
	
	System.out.println(x+y);
	}
}
