package com.springdi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.springdi.bean.Address;
import com.springdi.bean.Employee;

@Configuration
public class SpringConfig {
	
	@Bean
	public Address address() {
		return new Address("9th Cross", "Btm", "Blr");
		
	}
	
	@Bean
	public Employee employee() {
		return new Employee("Daksh", "Arya", "emp123");
	}

}
