package com.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FruitsConfig {

	@Bean
	public static Fruits getFrtObj() {
		return new Fruits();
	}
}
