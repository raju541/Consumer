package com.scb.springtest;

import java.util.List;

public class Coustmer {
	
	List<String> list=null;
	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	public Coustmer() {
		
		System.out.println("Coustmer object is created");
	}
	
	Calculater ctx=null; 
	
	public Calculater getCtx() {
		return ctx;
	}

	public void setCtx(Calculater ctx) {
		this.ctx = ctx;
	}

	public void calculate() {
	ctx.add(4, 3);
	}
}
