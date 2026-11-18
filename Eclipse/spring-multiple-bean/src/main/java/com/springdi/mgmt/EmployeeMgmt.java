package com.springdi.mgmt;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.springdi.bean.Employee;

@Component
public class EmployeeMgmt {
	
	private static final Logger log = LogManager.getLogger();
	
	@Autowired
	@Qualifier("emp1")
	Employee employee;
	
	public void display() {
	
		log.info("This is EmployeeMgmt display method Start");
		
		employee.displayDetails();
		
		log.info("This is EmployeeMgmt display method End");
		
	}

}
