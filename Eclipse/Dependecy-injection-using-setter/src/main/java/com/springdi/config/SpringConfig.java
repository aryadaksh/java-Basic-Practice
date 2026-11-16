package com.springdi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.springdi.bean.Address;
import com.springdi.bean.Employee;

@Configuration
public class SpringConfig {
	
	@Bean
	public Address address() {
		return new Address("9th Cross", "Btm 1st Main", "Blr");
	}
	
	@Bean("emp")
	public Employee employee() {
		Employee emp = new Employee("Daksh", "Arya", "emp123");
		emp.setAddress(address());
		return emp;
	}

}
