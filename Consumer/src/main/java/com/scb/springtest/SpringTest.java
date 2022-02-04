package com.scb.springtest;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
	
	public static void main(String[] args) {
		
		
		/*
		 * ApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");
		 * Coustmer coustmer=(Coustmer)ctx.getBean("cost"); List<String>
		 * list=coustmer.getList(); for (String object : list) {
		 * System.out.println(object); }
		 */
		 
		
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");
		Calculater coustmer=(Calculater)ctx.getBean("ctxp");
		
		System.out.println(coustmer.name);
		System.out.println(coustmer.p);
		
	}
}
