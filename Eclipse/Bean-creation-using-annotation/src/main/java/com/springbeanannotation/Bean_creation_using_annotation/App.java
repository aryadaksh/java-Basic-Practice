package com.springbeanannotation.Bean_creation_using_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.SpringConfig;
import com.springbeanannotation.pojoclass.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Creating bean using Annotation" );
        
        ApplicationContext iocContainer = new AnnotationConfigApplicationContext(SpringConfig.class);
        
       Employee emp =  iocContainer.getBean(Employee.class);
       
       System.out.println(emp.getId() +" "+emp.getName());
        
    }
}
