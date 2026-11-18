package com.amazon.shop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.amazon.shop.config.AppConfig;
import com.amazon.shop.pojo.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext iocContainer = new AnnotationConfigApplicationContext(AppConfig.class);
        Employee emp = iocContainer.getBean(Employee.class);
        System.out.println(emp.display());
    }
}
