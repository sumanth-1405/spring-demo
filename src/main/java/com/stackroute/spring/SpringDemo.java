package com.stackroute.spring;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemo {
	public static void main(String[] args) {
	ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
	//SpringDemo1 obj=new SpringDemo1();
	
	SpringDemo1 obj=(SpringDemo1) ctx.getBean("demobean");
	obj.demo();
	}

}
