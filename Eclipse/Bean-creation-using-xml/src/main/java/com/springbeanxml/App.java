package com.springbeanxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springbeanxml.pojoclass.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      String configPath = "employeebean.xml";
      
      ApplicationContext iocContainer = new ClassPathXmlApplicationContext(configPath);
      
      Employee emp1 = (Employee) iocContainer.getBean("emp1",Employee.class);
      System.out.println(emp1.getId());
      System.out.println(emp1.getName());
      System.out.println(emp1.getAddress().getLine1());
      System.out.println(emp1.getAddress().getLine2());
    }
}
