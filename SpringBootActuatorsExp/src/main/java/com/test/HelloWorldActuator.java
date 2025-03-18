package com.test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.entity.User;

@RestController
public class HelloWorldActuator {

	@Value("${name.fname}")
	private String fname;
	
	@Value("${email.email}")
	private String email;
	
	@Value("${desg.role}")
	private String desgrole;
	
	
	User obj = new User();
	@GetMapping("/test")
	public String testActuator() {
		obj.setFname(fname);
		obj.setEmail(email);
		obj.setDesgrole(desgrole);
		return "Simple Actuator Response"+obj;
	}
}
