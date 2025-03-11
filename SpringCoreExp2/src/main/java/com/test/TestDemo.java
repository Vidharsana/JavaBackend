package com.test;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDemo {

	public static void main(String[] args) {
		/*ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		Student obj = ctx.getBean("std",Student.class);
		System.out.println(obj);*/
		
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(StdConfig.class);
		Student obj = ctx.getBean("getStdObj",Student.class);
		obj.setId(111);
		obj.setName("Kohli");
		List <String> skills = Arrays.asList("python", ".net","spring");
		obj.setSkills(skills);
		System.out.println(obj);
	}
}
