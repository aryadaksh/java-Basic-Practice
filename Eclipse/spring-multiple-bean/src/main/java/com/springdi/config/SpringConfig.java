package com.springdi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.springdi.bean.Employee;

@Configuration
@ComponentScan(basePackages = "com.springdi")
public class SpringConfig {
	
	@Bean("emp1")
	public Employee createBeanEmployee1() {
		return new Employee("Daksh", "Arya", "emp123");
	}
	
	@Bean("emp2")
	@Primary
	public Employee createBeanEmployee2() {
		return new Employee("Daiwik", "Arya", "emp321");
	}

}
     