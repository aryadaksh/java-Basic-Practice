package com.springdi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springdi.bean.Employee;
import com.springdi.config.SpringConfig;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext iocContainer = new AnnotationConfigApplicationContext(SpringConfig.class);
        Employee emp = (Employee) iocContainer.getBean("emp");
        
        System.out.println(emp.displayDetails());
        
    }
}
