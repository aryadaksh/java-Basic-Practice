package com.amazon.shop.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

import com.amazon.shop.pojo.Employee;

@Configuration
public class AppConfig {
	
	@Bean
	/*
	 * @Scope("singleton")
	 * 
	 * @Scope("prototype")
	 * 
	 * @Scope("request")
	 * 
	 * @Scope("session")
	 * 
	 * @Scope("application")
	 */
	public Employee createBeanEmployee1() {
		return new Employee("Daksh", "Arya");
	}

	@Bean
	/* @Primary */
	@Scope("prototype")
	public Employee createBeanEmployee2() {
		return new Employee("Daksh", "Arya");
	}
}
