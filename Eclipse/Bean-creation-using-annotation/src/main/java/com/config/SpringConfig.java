package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.springbeanannotation.pojoclass.Employee;

@Component
@ComponentScan(basePackages = "com.springbeanannotation.pojoclass")
public class SpringConfig {
	
	@Bean("emp1")
	public Employee creatingBeanEmployee() {
		Employee emp = new Employee();
		emp.setId("KW123");
		emp.setName("Daksh Arya");
		return emp;
	}

}
