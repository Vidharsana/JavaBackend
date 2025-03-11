package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDemo {

	public static void main(String[] args) {
		/*ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		Fruits obj = ctx.getBean("frt",Fruits.class);
		System.out.println(obj);*/
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(FruitsConfig.class);
		Fruits obj = ctx.getBean("getFrtObj",Fruits.class);
		obj.setName("Orange");
		obj.setColor("orange");
		obj.setPrice(300);
		obj.setQnt(4);
		System.out.println(obj);
	}
}
