package com.springbeanjava.bean_creation_by_java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.pojoclass.Employee;
import com.springbeanjava.config.SpringConfg;

public class App {
	public static void main(String[] args) {
		System.out.println("Bean Creation Using Java!!");
		System.out.println();

		ApplicationContext iocContainer = new AnnotationConfigApplicationContext(SpringConfg.class);
		Employee employee = (Employee) iocContainer.getBean("emp1");

		System.out.println("Name : " + employee.getName() + " Id : " + employee.getId());
		System.out.println("Address : " + employee.getAddress().getLine1() + "  " + employee.getAddress().getLine2());

		System.out.println();

		Employee employee1 = (Employee) iocContainer.getBean("emp2");

		System.out.println("Name : " + employee1.getName() + " Id : " + employee1.getId());
		System.out.println("Address : " + employee1.getAddress().getLine1() + "  " + employee1.getAddress().getLine2());

	}
}
