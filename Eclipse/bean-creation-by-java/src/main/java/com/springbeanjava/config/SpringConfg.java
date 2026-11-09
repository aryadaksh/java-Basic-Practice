package com.springbeanjava.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.pojoclass.Address;
import com.pojoclass.Employee;

@Configuration
public class SpringConfg {
	
	@Bean("address1")
	/* @Primary */
	public Address createAddressBean() {
		Address address = new Address();
		address.setLine1("BLR");
		address.setLine2("IND");
		
		return address;
		
	}
	
	@Bean("address2")
	//@Primary // -> 
	public Address createAddressBean2() {
		Address address = new Address();
		address.setLine1("BSF");
		address.setLine2("IND");
		
		return address;
		
	}
	

	
	@Bean("emp1")
	public Employee createEmpBean(@Qualifier("address2") Address address) {
		Employee emp = new Employee();
		emp.setName("Daksh Arya");
		emp.setId("D123");
		emp.setAddress(address);
		
		return emp;
		
	}
	
	@Bean("emp2")
	public Employee createEmpBean1(@Qualifier("address1") Address address) {
		Employee emp = new Employee();
		emp.setName("Daiwik Arya");
		emp.setId("D7890");
		emp.setAddress(address);
		
		return emp;
		
	}
	
	
}
